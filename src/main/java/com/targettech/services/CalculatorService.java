package com.targettech.services;

import com.targettech.model.CalculateRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorService {
    List<String> calculatedValues;
    public List<String> calculateValues(CalculateRequest calculateRequest) {

        calculatedValues = new ArrayList<>();
        if (calculateRequest.getType().equalsIgnoreCase("add")) {
            double calculateValue = ((calculateRequest.getNumber1()) + (calculateRequest.getNumber2()));
            calculatedValues.add(Double.toString(calculateValue));
        }

        else if(calculateRequest.getType().equalsIgnoreCase("subtract")){
            double calculateValue = ((calculateRequest.getNumber1()) - (calculateRequest.getNumber2()));
            calculatedValues.add(Double.toString(calculateValue));
        }

        else if(calculateRequest.getType().equalsIgnoreCase("multiply")){
            double calculateValue = ((calculateRequest.getNumber1()) * (calculateRequest.getNumber2()));
            calculatedValues.add(Double.toString(calculateValue));
        }

        else if(calculateRequest.getType().equalsIgnoreCase("divide")){
            double calculateValue = ((calculateRequest.getNumber1()) / (calculateRequest.getNumber2()));
            calculatedValues.add(Double.toString(calculateValue));
        }

        return calculatedValues;
    }
}