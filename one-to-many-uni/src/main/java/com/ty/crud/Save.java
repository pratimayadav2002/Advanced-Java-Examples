package com.ty.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Account;
import com.ty.entity.Bank;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank b1 = new Bank(2, "BOB", "Thane");
		
		Account a1 = new Account(9090, "xyz" , 11000);
		Account a2 = new Account(800, "pqr" , 153000);
		Account a3 = new Account(1019, "abc" , 270000);
		
		b1.setAccounts(Arrays.asList(a1,a2,a3));
		
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(b1);
		et.commit();
		
		System.out.println("saved");
		
		
	}
}
