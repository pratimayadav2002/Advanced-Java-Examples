package com.ty.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteMovie {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Movie m1 = em.find(Movie.class, 4);
//		Actor a1 = em.find(Actor.class, 2);
		
		if (m1 != null) {
			
			et.begin();
			em.remove(m1);
			et.commit();
				
//			   if (a1 != null) {
//					
//					et.begin();
//					em.remove(a1);
//					et.commit();
			
			System.out.println("deleted");
		} else {
			System.out.println("not found");
		}
	}
}
