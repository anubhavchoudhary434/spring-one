package com.luv2code.springdemo;

import java.util.Random;

public class PracticeFortuneService implements FortuneService {

	private String[] randomFortunes = {"You will be successful one day","Very soon you will be happy","You will get all what you dreamt of"};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int randomInt = myRandom.nextInt(randomFortunes.length);
		// TODO Auto-generated method stub
		return randomFortunes[randomInt];
	}

}
