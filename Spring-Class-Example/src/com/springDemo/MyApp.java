package com.springDemo;

public class MyApp {

	public static void main(String[] args) {
		Coach b = new HockeyCoach();
		Coach c = new BaseballCoach();
		
		System.out.println(b.getDailyWorkout());
		System.out.println(c.getDailyWorkout());

	}

}
