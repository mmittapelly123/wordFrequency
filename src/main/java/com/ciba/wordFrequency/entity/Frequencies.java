package com.ciba.wordFrequency.entity;

import java.util.Map;

public class Frequencies {

   private Map<String,Integer> frequencies;

   public Frequencies(Map<String,Integer> frequencies) {
      this.frequencies = frequencies;
   }

    public Map<String, Integer> getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(Map<String, Integer> frequencies) {
        this.frequencies = frequencies;
    }
}
