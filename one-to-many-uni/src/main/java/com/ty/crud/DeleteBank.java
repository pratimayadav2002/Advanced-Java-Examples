package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Bank;

public class DeleteBank {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Bank b1 = em.find(Bank.class, 2);
	
	if(b1 != null) {
		
		et.begin();
		em.remove(b1);
		et.commit();
		System.out.println("deleted record");
	}else {
		System.out.println("not found");
	}
	
	
			
}
}
