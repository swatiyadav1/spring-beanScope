package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call methods bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(theCoach.getDailyForutne());
		
		System.out.println("team name is "+theCoach.getTeam());
		//close context
context.close();

	}

}
