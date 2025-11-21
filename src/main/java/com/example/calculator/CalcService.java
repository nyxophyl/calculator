package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public CalculationResult calculate(double term1, double term2, String operator) {
        double result = switch (operator) {
            case "+" -> term1 + term2;
            case "-" -> term1 - term2;
            case "*" -> term1 * term2;
            case "/" -> {
                if (term2 == 0) {
                    throw new ArithmeticException("Division durch Null");
                }
                yield term1 / term2;
            }
            default -> throw new UnsupportedOperationException("Operator nicht unterstützt");
        };
        return new CalculationResult(term1, term2, operator, result);
    }
}