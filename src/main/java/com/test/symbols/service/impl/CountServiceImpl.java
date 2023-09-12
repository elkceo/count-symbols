package com.test.symbols.service.impl;

import com.google.gson.Gson;
import com.test.symbols.service.CountService;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.stream.Collectors.toMap;

@Service
public class CountServiceImpl implements CountService {
    private final Gson gson = new Gson();

    @Override
    public String countSymbols(String input) {
        Map<Character, Integer> result = new HashMap<>();
        var charsArray = input.toCharArray();
        for (char c : charsArray) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        var sorted = result.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        var str = gson.toJson(sorted);
        return str.substring(1, str.length() - 1);
    }
}
