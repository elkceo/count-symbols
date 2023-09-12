package com.test.symbols;

import com.test.symbols.controller.Controller;
import com.test.symbols.service.CountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SymbolsApplicationTests {
    @Autowired
    private CountService countService;
    @Autowired
    private Controller controller;

    @Test
    void contextLoads() {
    }

    @Test
    void testCountSymbols() {
        String input = "aaaaabcccc";
        String expected = "\"a\":5,\"c\":4,\"b\":1";
        String actual = countService.countSymbols(input);
        assertEquals(expected, actual);
    }

    @Test
    void testController() {
        String input = "aaaaabcccc";
        String expected = "\"a\":5,\"c\":4,\"b\":1";
        ResponseEntity<?> responseEntityExpected = new ResponseEntity<>(expected, HttpStatus.OK);
        ResponseEntity<?> responseEntityActual =controller.countSymbols(input);
        assertEquals(responseEntityExpected, responseEntityActual);
    }


}
