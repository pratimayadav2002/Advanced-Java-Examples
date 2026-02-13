package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarEngineDriver {
public static void main(String[] args) {
	
	ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("objconfig.jsp");
	
	Car c1 = (Car) app.getBean("carBean");
	c1.drive();
}
}
