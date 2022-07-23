package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
				
				//retrieve bean
				Coach theCoach = context.getBean("myCoach",Coach.class);
				
				Coach alphaCoach = context.getBean("myCoach",Coach.class);
				
				boolean result=(theCoach==alphaCoach);
				
				System.out.println("are they same ? "+result);
				
				
				System.out.println("momory location of the coach "+theCoach);
				
				System.out.println("momory location of alpha coach "+alphaCoach);
				
				//call methods bean
				
				System.out.println(theCoach.getDailyWorkout());
				
				
				System.out.println(theCoach.getDailyForutne());
				//close context
		context.close();

	}

}
