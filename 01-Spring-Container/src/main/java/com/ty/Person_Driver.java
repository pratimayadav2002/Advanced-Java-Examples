package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person_Driver {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		 
		Person p1 = (Person) app.getBean("bean2");
		p1.run();
		
	}
}
