package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Driver {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		Student s1 = (Student) app.getBean("bean1");
		s1.study();
	}
}
