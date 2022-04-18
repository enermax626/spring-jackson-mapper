package com.example.controller;


import com.example.dto.RequestDTO;
import com.example.dto.ResponseDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {

    @PostMapping
    public ResponseEntity<ResponseDTO> test(@RequestBody(required = false) RequestDTO requestData) {

        ResponseDTO response = ResponseDTO.builder()
                .objectName(requestData.getObjectName())
                .objectValue(requestData.getObjectValue())
                .build();

        return ResponseEntity.ok(response);
    }
}
