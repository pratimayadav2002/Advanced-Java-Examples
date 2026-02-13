package com.emp.crud;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.emp.entity.Employee;

public class fetchAll_3 {
public static void main(String[] args) {
	
	// This is used to fetch salary & email records from the database.

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	String jpql = "select emp from Employee emp where emp.salary=:empsal and emp.email=:empemail";
//	String jpql = "select emp from Employee emp where emp.salary=?1 and emp.email=?2";
	
	Query q1 = em.createQuery(jpql);
	q1.setParameter("empsal", 70000D); // named parameter
	q1.setParameter("empemail", "pratima@gmail.com"); // named parameter
	
//	q1.setParameter(1, 70000D); // index parameter
//	q1.setParameter(2, "pratima@gmail.com"); // index parameter
	
	List<Employee> l1 = q1.getResultList();
	
	if (l1.isEmpty()) {
		System.out.println("no record found");
	}else {
		for (Employee employee : l1) {
			System.out.println(employee.getEid());
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());
			System.out.println(employee.getSalary());
		}
	}
}
}
