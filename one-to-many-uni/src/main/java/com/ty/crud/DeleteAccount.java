package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Account;

public class DeleteAccount {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Account a1 = em.find(Account.class, 800l);
	
	if(a1 != null) {
		et.begin();
		em.remove(a1);
		et.commit();
		System.out.println("record deleted");
	}else {
		System.out.println( "record not found");
	}
}
}
