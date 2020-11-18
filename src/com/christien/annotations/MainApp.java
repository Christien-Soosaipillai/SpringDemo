package com.christien.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	/*
	 * @Required is now deprecated
	 * 
	 *@Autowired On Setter Methods:
	 * You can use @Autowired annotation on setter methods to get rid of the <property> element in XML configuration file. 
	 * When Spring finds an @Autowired annotation used with setter methods, it tries to perform byType autowiring on the method.
	 * 
	 *@Autowired on Properties
	 * You can use @Autowired annotation on properties to get rid of the setter methods. When you will pass values of autowired 
	 * properties using <property> Spring will automatically assign those properties with the passed values or references.
	 *
	 *@Autowired on Constructors
	 * You can apply @Autowired to constructors as well. A constructor @Autowired annotation indicates that the constructor should be 
	 * autowired when creating the bean, even if no <constructor-arg> elements are used while configuring the bean in XML file. 
	 * 
	 * */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beans/AnnotationBeans.xml");
		Bow bow = (Bow) context.getBean("bow");
		System.out.println(bow);
		
		Archer archer = (Archer) context.getBean("Archer1");
		System.out.println(archer.toString());
		
		Hunter hunter = (Hunter) context.getBean("Hunter");
		System.out.println(hunter.toString());
		System.out.println(hunter.getArcher().toString());
		System.out.println("Level: " + hunter.getLicense().getLevel());
		hunter.getLicense().getTag().authenticate();
		
	}
	
}
