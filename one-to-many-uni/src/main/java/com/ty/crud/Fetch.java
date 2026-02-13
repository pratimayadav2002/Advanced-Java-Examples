package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Account;
import com.ty.entity.Bank;

public class Fetch {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	Bank b1 = em.find(Bank.class, 1);
	
	if(b1 != null) {
		System.out.println("----Bank----");
		System.out.println(b1.getBid());
		System.out.println(b1.getName());
		System.out.println(b1.getAddress());
		
		List<Account> a1 = b1.getAccounts();
		System.out.println("-----Accounts-----");
		for (Account account : a1) {
			System.out.println(account.getName());
			System.out.println(account.getAccno());
			System.out.println(account.getAmount());
			System.out.println("**************");
		}
	}else {
		System.out.println("not found");
	}	
}
}
