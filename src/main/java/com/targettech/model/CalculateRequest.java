package com.targettech.model;
import javax.validation.constraints.NotBlank;
import java.util.List;

public class CalculateRequest {
    @NotBlank(message = "Values can't be empty!")
    double number1;
    double number2;
    String  type;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(String type) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(String values) {
        this.number2 = number2;
    }

    public String getType() {
        return type;
    }

    public void setType(String values) {
        this.type = type;
    }

    }
