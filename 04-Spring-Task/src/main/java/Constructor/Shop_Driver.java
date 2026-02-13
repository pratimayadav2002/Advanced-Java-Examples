package Constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Shop_Driver {
public static void main(String[] args) {
	
	ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("conmap.xml");
	
	Shop s1 = (Shop) app.getBean("shopId");
	s1.details();
	
}
}
