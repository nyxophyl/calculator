package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.StandardCharsets;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest( classes = {CalcController.class, CalcService.class})
@AutoConfigureMockMvc
public class CalcControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCalculate() throws Exception {
        mockMvc.perform(get("/calc?term1=2.0&term2=3.0&operator=+").contentType(MediaType.APPLICATION_JSON).characterEncoding(StandardCharsets.UTF_8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.term1").value(2.0))
                .andExpect(jsonPath("$.term2").value(3.0))
                .andExpect(jsonPath("$.operator").value("+"))
                .andExpect(jsonPath("$.result").value(5.0));
    }
}