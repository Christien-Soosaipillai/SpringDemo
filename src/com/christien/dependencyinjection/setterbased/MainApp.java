package com.christien.dependencyinjection.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.number.NumberStyleFormatter;

public class MainApp {

	public static void main(String[] args){
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beans/DIBeans.xml");
		Meal meal = (Meal) context.getBean("Meal");
		meal.GetMealSummary();
		
	}
	
	
	
	
}
