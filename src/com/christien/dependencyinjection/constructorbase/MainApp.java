package com.christien.dependencyinjection.constructorbase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beans/DIBeans.xml");
		
		//Constructor based dependency injection using constructor-arg 
		CarTester carTester = (CarTester) context.getBean("CarTester");
		EmissionTester emissionTester =  carTester.getEmissionTester();
		emissionTester.checkEmissions();
		
		
		DualBlader dualBlader = (DualBlader) context.getBean("DualBlader");
		dualBlader.listStats();
		
		
	}

}
