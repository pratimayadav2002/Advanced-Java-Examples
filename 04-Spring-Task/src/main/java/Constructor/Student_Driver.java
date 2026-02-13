package Constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_Driver {
public static void main(String[] args) {
	
	ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("conlist.xml");
	
	Student s1 = (Student) app.getBean("studentBean");
	
	s1.details();
	
}
}
