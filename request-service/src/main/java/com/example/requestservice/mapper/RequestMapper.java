package com.example.requestservice.mapper;

import com.example.requestservice.dto.RequestDto;
import com.example.requestservice.entity.Request;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RequestMapper extends EntityMapper<RequestDto, Request> {


}
