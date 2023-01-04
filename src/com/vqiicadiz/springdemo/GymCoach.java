package com.vqiicadiz.springdemo;

public class GymCoach implements Coach {

	private FortuneService fortuneService;
	
	public GymCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Don't let your dreams be dreams, bench ten 20kg each side 10 reps NOW";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
