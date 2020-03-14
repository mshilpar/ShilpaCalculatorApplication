package com.targettech.controller;

import com.targettech.services.CalculatorService;
import com.targettech.model.CalculateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calService;

    @PostMapping("/api/calculate")
    public ResponseEntity<?> calculate(@Valid @RequestBody CalculateRequest calculateRequest) {

        List<String> resultFromService = calService.calculateValues(calculateRequest);
        return ResponseEntity.ok( resultFromService );
    }

    @GetMapping("/test")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("testing");
    }
}
