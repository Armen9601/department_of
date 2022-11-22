package com.example.requestservice.service.impl;

import com.example.requestservice.dto.RequestDto;
import com.example.requestservice.entity.Request;
import com.example.requestservice.exception.EntityNotFoundException;
import com.example.requestservice.mapper.RequestMapper;
import com.example.requestservice.repo.RequestRepository;
import com.example.requestservice.service.RequestService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Log4j2
public class RequestServiceImpl implements RequestService {

    private final RequestRepository repository;

    private final RequestMapper mapper;

    public RequestServiceImpl(RequestRepository repository, RequestMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;

    }

    @Override
    public RequestDto add(RequestDto requestDto) {
        requestDto.setCreatedDate(LocalDateTime.now());
        Request savedRequest = repository.save(mapper.toEntity(requestDto));
        log.info("request is added: id: {}", savedRequest.getId());
        return mapper.toDto(savedRequest);
    }

    @Override
    public RequestDto findById(UUID id) {
        return mapper.toDto(repository.findById(id).orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public RequestDto update(RequestDto requestDto) {
        Request updated = repository.save(mapper.toEntity(requestDto));
        log.info("request is updated: id: {}", updated.getId());
        return mapper.toDto(updated);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}
