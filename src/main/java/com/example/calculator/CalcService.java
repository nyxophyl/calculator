package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public CalculationResult calculate(double term1, double term2, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = term1 + term2;
                break;
            case "-":
                result = term1 - term2;
                break;
            case "*":
                result = term1 * term2;
                break;
            case "/":
                if (term2 == 0) {
                    throw new ArithmeticException("Division durch Null");
                }
                result = term1 / term2;
                break;
            default:
                throw new UnsupportedOperationException("Operator nicht unterstützt");
        }
        return new CalculationResult(term1, term2, operator, result);
    }
}