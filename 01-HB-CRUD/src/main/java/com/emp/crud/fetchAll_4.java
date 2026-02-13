package com.emp.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.emp.entity.Employee;

public class fetchAll_4 {
public static void main(String[] args) {
	
	// This is used to fetch All email records from the database.

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	String jpql = "select emp.email from Employee emp";
	Query q1 = em.createQuery(jpql);
	
	List<Employee> l1 = q1.getResultList();
	if (l1.isEmpty()) {
		System.out.println("no record present");
	}else {
		System.out.println(l1);
	}
	
	
}
}
