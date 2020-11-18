package com.christien.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beans/CollectionsBeans.xml");
		ArcheryShop archeryShop = (ArcheryShop) context.getBean("ArcheryShop");
		archeryShop.listMembers();
		archeryShop.viewBowShop();
		archeryShop.viewSessionTypes();

	}

}
