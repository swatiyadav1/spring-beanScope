package com.springDemo;

public class HockeyCoach implements Coach {

private FortuneService fs;
	
public HockeyCoach() {
	
}
	//constructor for dependency injection
	public HockeyCoach(FortuneService tfs) {
		fs=tfs;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "plank for 10 min";
	}
	@Override
	public String getDailyForutne() {
		
		return fs.getFortune();
	}

}
