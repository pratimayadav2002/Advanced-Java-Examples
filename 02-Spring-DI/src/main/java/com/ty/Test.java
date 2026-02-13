package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
	
	Employee e1 = (Employee) app.getBean("empId");
	e1.task();
	e1.display();
}
}
