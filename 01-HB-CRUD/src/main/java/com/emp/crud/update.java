package com.emp.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.emp.entity.Employee;

public class update {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e1 = em.find(Employee.class, 101);
		
		if (e1 != null) {
			e1.setSalary(70000);
			
			et.begin();
			em.merge(e1);
			et.commit();
			
			System.out.println("employee salary update");
		}else {
			System.out.println("record not found");
		}
		
	}
}
