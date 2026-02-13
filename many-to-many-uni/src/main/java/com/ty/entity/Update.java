package com.ty.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Actor a1 = em.find(Actor.class, 1);
	
	if (a1 != null) {
		a1.setAge(40);
		et.begin();
		em.merge(a1);
		et.commit();
		
		System.out.println("updated");
	} else {
		System.out.println("not found");
	}
}
}
