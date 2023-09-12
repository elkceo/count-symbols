package com.test.symbols.controller;

import com.test.symbols.service.CountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
@AllArgsConstructor
public class Controller {
    private CountService countService;

    @PostMapping(path = "/count")
    public ResponseEntity<?> countSymbols(@RequestBody String input) {
        return new ResponseEntity<>(countService.countSymbols(input), HttpStatus.OK);
    }
}
