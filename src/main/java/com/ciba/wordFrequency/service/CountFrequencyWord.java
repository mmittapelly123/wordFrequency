package com.ciba.wordFrequency.service;

import com.ciba.wordFrequency.entity.Frequencies;
import com.ciba.wordFrequency.entity.Words;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CountFrequencyWord {

    public Frequencies count(Words words) {

        Map<String, Integer> frequencies = new HashMap<String, Integer>();
        for (String i : words.getWords()) {
            Integer j = frequencies.get(i);
            frequencies.put(String.valueOf(i), (j == null) ? 1 : j + 1);
        }
        for (Map.Entry<String, Integer> val : frequencies.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }

        return new Frequencies(frequencies);
    }
}
