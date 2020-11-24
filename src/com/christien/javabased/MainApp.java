package com.christien.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ArcherConfig.class);
		context.refresh();
		
		Archer archer = context.getBean(Archer.class);
		System.out.println(archer.toString());
		License license = context.getBean(License.class);
		System.out.println(license.toString());
		
	}
	
}
