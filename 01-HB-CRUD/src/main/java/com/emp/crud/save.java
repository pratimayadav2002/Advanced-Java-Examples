package com.emp.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.emp.entity.Employee;

public class save {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Employee e1 = new Employee();
	e1.setEid(105);
	e1.setName("ajit");
	e1.setEmail("ajit@gmail.com");
	e1.setSalary(900000);
	
	et.begin();
	em.persist(e1);
	et.commit();
	System.out.println("employee saved");
	
}
}
