package com.example.calculator;

public class CalculationResult {
    private double term1;
    private double term2;
    private String operator;
    private double result;

    public CalculationResult(double term1, double term2, String operator, double result) {
        this.term1 = term1;
        this.term2 = term2;
        this.operator = operator;
        this.result = result;
    }

    public double getTerm1() {
        return term1;
    }

    public double getTerm2() {
        return term2;
    }

    public String getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }
}