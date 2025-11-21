package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    private final CalcService calcService;

    @Autowired
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping("/calc")
    public CalculationResult calculate(@RequestParam double term1, @RequestParam double term2, @RequestParam String operator) {
        return calcService.calculate(term1, term2, operator);
    }
}