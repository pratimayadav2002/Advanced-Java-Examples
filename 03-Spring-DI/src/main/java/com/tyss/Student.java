package com.tyss;

import java.util.List;

public class Student {

	String name;
	List<String> subjects;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public void display () {
		System.out.println("-----student name-----");
		System.out.println("Name : "+name);
		System.out.println("-----subjects------");
		System.out.println("Subjects : "+subjects);
	}
	
	
}
