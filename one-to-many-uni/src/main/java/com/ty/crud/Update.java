package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Account;
import com.ty.entity.Bank;

public class Update {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
//	Bank b1 = em.find(Bank.class, 1);
	
//	if(b1 != null) {
//		b1.setAddress("kurla");
//		System.out.println("record updated");
//		
//		et.begin();
//		em.merge(b1);
//		et.commit();
//		
//	}else {
//		System.out.println("not found");
//	}
	
	Account a1 = em.find(Account.class, 1199l);
	if(a1 != null) {
		a1.setAmount(555555D);
		System.out.println("record updated");
		
		et.begin();
		em.merge(a1);
		et.commit();
		
	}else {
		System.out.println("not found");
	}
	
}
}
