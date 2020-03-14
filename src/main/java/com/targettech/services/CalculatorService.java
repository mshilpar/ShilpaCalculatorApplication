package com.targettech.services;

import com.targettech.model.CalculateRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

@Service
public class CalculatorService {
    List<String> calculatedValues;
    public List<String> calculateValues(CalculateRequest calculateRequest) {

        calculatedValues = new ArrayList<>();
        if (calculateRequest.getOperation().equalsIgnoreCase("add")) {
            double calculateValue = ((calculateRequest.getNumber1()) + (calculateRequest.getNumber2()));
            calculatedValues.add(Double.toString(calculateValue));
        }

        else if(calculateRequest.getOperation().equalsIgnoreCase("subtract")){
            double calculateValue = ((calculateRequest.getNumber1()) - (calculateRequest.getNumber2()));
            calculatedValues.add(Double.toString(calculateValue));
        }

        else if(calculateRequest.getOperation().equalsIgnoreCase("multiply")){
            double calculateValue = ((calculateRequest.getNumber1()) * (calculateRequest.getNumber2()));
            calculatedValues.add(Double.toString(calculateValue));
        }

        else if(calculateRequest.getOperation().equalsIgnoreCase("divide")){
            double calculateValue = ((calculateRequest.getNumber1()) / (calculateRequest.getNumber2()));
            calculatedValues.add(Double.toString(calculateValue));
        }

        return calculatedValues;
    }
}