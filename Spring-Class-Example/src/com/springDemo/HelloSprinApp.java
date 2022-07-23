package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSprinApp {

	public static void main(String[] args) {
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve bean
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(theCoach.getDailyForutne());
		//close context
context.close();
	}

}
