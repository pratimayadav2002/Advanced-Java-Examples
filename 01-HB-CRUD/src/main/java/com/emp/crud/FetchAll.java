package com.emp.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.emp.entity.Employee;

public class FetchAll {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	// This is used to fetch all records from the database.
	
	String jpql = "select emp  from Employee emp";
	Query q1 = em.createQuery(jpql);
	
	List<Employee> l1 = q1.getResultList();
	
	if (l1.isEmpty()) {
		System.out.println("no records found");
	}else {
		for (Employee employee : l1) {
			System.out.println(employee.getEid());
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());
			System.out.println(employee.getSalary());
			System.out.println("******************");
		}
	}
	
}
}
