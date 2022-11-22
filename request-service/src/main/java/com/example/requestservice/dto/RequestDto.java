package com.example.requestservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {

    private UUID id;
    private UUID applicantId;
    private LocalDateTime createdDate;

}
