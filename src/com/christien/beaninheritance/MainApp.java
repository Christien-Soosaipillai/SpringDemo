package com.christien.beaninheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beans/InheritanceBeans.xml");
		FirstGenCharger charger = (FirstGenCharger) context.getBean("FirstGenCharger");
		charger.getCarReciept();
		
		/*In the Beans xml we never set the body parameter however since the 'SecondGenCharger' is a child
		 *of the 'FirstGenCharger' then we can apply the parent values for similar undeclared vars to their 
		 *child
		*/
		SecondGenCharger charger2 = (SecondGenCharger) context.getBean("SecondGenCharger");
		charger2.getCarReciept();
		
		
	}

}
