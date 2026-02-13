package com.emp.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.emp.entity.Employee;

public class delete {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Employee e1 = em.find(Employee.class, 105);
	
	if (e1 != null) {
		et.begin();
		em.remove(e1);
		et.commit();
		
		System.out.println("record deleted");
		
	}else {
		System.out.println("not found record");
	}
}
}
