package Constructor;

import java.util.Map;

public class Shop {
	
	String name;
	Map<String, Double> items;
	
	public Shop(String name, Map<String, Double> items) {
		this.name = name;
		this.items = items;
	}
	
	public void details() {
		System.out.println("Name : "+name);
		System.out.println("Items : "+items);
	}
	
}
