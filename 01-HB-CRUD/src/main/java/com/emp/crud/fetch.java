package com.emp.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.emp.entity.Employee;

public class fetch {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	Employee e1 = em.find(Employee.class, 101);
	
	if(e1 != null) {
		System.out.println(e1.getEid());
		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
		System.out.println(e1.getSalary());
	}else {
		System.out.println("employee not found");

	}
	
}
}
