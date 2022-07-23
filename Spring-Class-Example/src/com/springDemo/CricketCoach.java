package com.springDemo;

public class CricketCoach implements Coach {

	
	private FortuneService fs;
	
	private String team;
	
	public void setTeam(String team) {
		System.out.println("cricketCoach:inside team setter");
		this.team = team;
	}
	public String getTeam() {
		return team;
	}
	public CricketCoach() {
		System.out.println("cricketCoach:inside no arg constructor");
	}
	public void setFortuneService(FortuneService fs) {
		System.out.println("cricketCoach:inside setter");
		this.fs = fs;
	}
	@Override
	public String getDailyWorkout() {
		
		return "bench for 30 min";
	}

	@Override
	public String getDailyForutne() {
		
		return fs.getFortune();
	}

}
