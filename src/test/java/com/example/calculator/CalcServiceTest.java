package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalcServiceTest {

    @Autowired
    private CalcService calcService;

    @Test
    public void testCalculate() {
        CalculationResult result = calcService.calculate(2, 3, "+");
        assertEquals(2, result.getTerm1());
        assertEquals(3, result.getTerm2());
        assertEquals("+", result.getOperator());
        assertEquals(5, result.getResult());
    }
}