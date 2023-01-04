package com.vqiicadiz.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String random[] = new String[] {"Very Lucky!",
				"Neutral!!", "Unlucky COGGERS"};
		Random rand = new Random();
		int num = rand.nextInt(3);
		return random[num];
	}

}
