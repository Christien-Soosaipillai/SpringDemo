package com.christien.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/beans/Beans.xml");
		//Singleton Method
		Plant rose = (Plant) context.getBean("rose");
		rose.getName();
		
		//Prototype Method
		Plant daisy = (Plant) context.getBean("daisy");
		daisy.getName();
		context.registerShutdownHook();
		
		//Constructor with arguments
		System.out.println("\nGarden Implementation");
		ApplicationContext appContext= new ClassPathXmlApplicationContext("com/beans/Beans.xml");
		Garden roseGarden = (Garden) context.getBean("roseGarden");
		roseGarden.getPlant().getName();
		roseGarden.getWaterSource().getType();
		roseGarden.bloomingGarden();
		
		ExampleBean bean = (ExampleBean) context.getBean("exampleBean");
		System.out.println(bean.getUltimateAnswer());
		System.out.println(bean.getYears());
		
	}

}
