package com.ciba.wordFrequency;

import com.ciba.wordFrequency.service.CountFrequencyWord;
import com.ciba.wordFrequency.entity.Frequencies;
import com.ciba.wordFrequency.entity.Words;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WordFrequencyApplicationTests {
	@Autowired
	CountFrequencyWord countFrequencyWord;

	@Test
	public void contextLoads() {
	}

	@Test
	public void countWordFrequency () {
		Words word = new Words();
		ArrayList<String> words = new ArrayList<String>() { {
			add("findow");
			add("Balloons");
			add("Elephants");
			add("Boom Bands");
			add("findow");
			add("Hakken-Kraks");
			add("Hakken-Kraks");
			add("Hakken-Kraks");
			add("Elephants");
		}};
		word.setWords(words);
		Frequencies count = countFrequencyWord.count(word);

		assertEquals(count.getFrequencies().size(),5);
		assertEquals(count.getFrequencies().get("Hakken-Kraks"), new Integer(3));
	}

}
