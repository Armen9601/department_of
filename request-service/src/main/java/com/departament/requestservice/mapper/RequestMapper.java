package com.departament.requestservice.mapper;

import com.departament.requestservice.dto.RequestDto;
import com.departament.requestservice.entity.Request;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RequestMapper extends EntityMapper<RequestDto, Request>{


}
