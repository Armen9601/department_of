package com.example.requestservice.service;

import com.example.requestservice.dto.RequestDto;

import java.util.UUID;

public interface RequestService {

    RequestDto add(RequestDto requestDto);

    RequestDto findById(UUID id);

    RequestDto update(RequestDto requestDto);

    void delete(UUID id);

}
