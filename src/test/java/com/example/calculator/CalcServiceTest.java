package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest (classes = CalcService.class)
public class CalcServiceTest {

    @Autowired
    private CalcService calcService;

    @Test
    public void testCalculate() {
        CalculationResult result = calcService.calculate(2, 3, "+");
        assertEquals(2, result.term1());
        assertEquals(3, result.term2());
        assertEquals("+", result.operator());
        assertEquals(5, result.result());
    }
}