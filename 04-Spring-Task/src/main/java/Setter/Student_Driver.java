package Setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Driver {
public static void main(String[] args) {
	
	ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("list.xml");
	
	Student s1 = (Student) app.getBean("studentId");
	s1.details();
	
}
}
