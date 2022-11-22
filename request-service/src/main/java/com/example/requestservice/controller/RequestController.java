package com.example.requestservice.controller;

import com.example.requestservice.dto.RequestDto;
import com.example.requestservice.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/request")
@RequiredArgsConstructor
public class RequestController {

    private final RequestService requestService;

    @PostMapping
    public ResponseEntity<RequestDto> add(@RequestBody RequestDto requestDto) {
        return ResponseEntity.ok(requestService.add(requestDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RequestDto> findById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(requestService.findById(id));
    }

    @PutMapping
    public ResponseEntity<RequestDto> update(@RequestBody RequestDto requestDto) {
        return ResponseEntity.ok(requestService.update(requestDto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") UUID id) {
        requestService.delete(id);
    }

}
