package com.targettech.model;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class CalculateRequest {
    @NotNull(message = "Number1 can't be empty!")
    Double number1;
    @NotNull(message = "Number2 can't be empty!")
    Double number2;
    @NotBlank(message = "Operations can't be empty!")
    String  operation;

    public double getNumber1() { return number1; }

    public void setNumber1(double number1){ this.number1 = number1; }

    public double getNumber2() { return number2; }

    public void setNumber2(double number2) { this.number2 = number2; }

    public String getOperation() { return operation; }

    public void setType(String operation) { this.operation = operation; }

    }
