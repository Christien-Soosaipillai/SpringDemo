package com.christien.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld singleton = (HelloWorld) context.getBean("helloWorldSingleton");
      HelloWorld prototype = (HelloWorld) context.getBean("helloWorldPrototype");
      
      singleton.setMessage("This is the singleton after set");
      prototype.setMessage("This is the prototype after set");
      
      
      HelloWorld singleton2 = (HelloWorld) context.getBean("helloWorldSingleton");
      HelloWorld prototype2 = (HelloWorld) context.getBean("helloWorldPrototype");
      
      singleton2.getMessage();
      prototype2.getMessage();
      
      }
}
