package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Car;
import com.ty.entity.Engine;

public class DeleteEngine {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		

		Engine e1 = em.find(Engine.class, 33);
		if (e1 != null) {
			et.begin();
			em.remove(e1);
			et.commit();
			
			System.out.println("record deleted");
		}else {
			System.out.println("not found record");
		}
	}
}
