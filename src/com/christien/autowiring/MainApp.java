package com.christien.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beans/AutoWiringBeans.xml");
		StreamingService streamingService = (StreamingService) context.getBean("streamingService");
		streamingService.startStream();
		streamingService.endStream();
	}

}
