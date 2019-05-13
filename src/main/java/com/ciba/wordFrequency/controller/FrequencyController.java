package com.ciba.wordFrequency.controller;

import com.ciba.wordFrequency.service.CountFrequencyWord;
import com.ciba.wordFrequency.entity.Frequencies;
import com.ciba.wordFrequency.entity.Words;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FrequencyController {

    @Autowired
    CountFrequencyWord frequencyWord;

    @PostMapping("/countWordFrequency")
    public @ResponseBody Frequencies countWordFrequency(@RequestBody Words words){
        Frequencies frequencies = frequencyWord.count(words);
        return frequencies;

    }

}
