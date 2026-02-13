package map;

import java.util.Map;

public class Shop {

	String name;
	
	Map<String, Double> items;

	public void setName(String name) {
		this.name = name;
	}

	public void setItems(Map<String, Double> items) {
		this.items = items;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Items : "+items);
	}
}
