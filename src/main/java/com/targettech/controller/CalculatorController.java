package com.targettech.controller;

import com.targettech.services.CalculatorService;
import com.targettech.model.CalculateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calService;

    @PostMapping("/api/convert")
    public ResponseEntity<?> convert(@Valid @RequestBody CalculateRequest conversionRequest) {

        List<String> resultFromService = calService.calculateValues(conversionRequest);
        return ResponseEntity.ok( resultFromService );
    }
}
