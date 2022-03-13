package com.luv2code.springdemo;

public class GolfCoachPractice implements Coach {
	
	private FortuneService fortuneService;
	public GolfCoachPractice(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hit the golf ball at 45 degree angle";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
