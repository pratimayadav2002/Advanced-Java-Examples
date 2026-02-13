package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Car;
import com.ty.entity.Engine;

public class Update {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car c1 = em.find(Car.class, 1);
		
		if (c1 != null) {
			c1.setPrice(3000000);
			
			Engine e1 = c1.getEngine();
			e1.setCc(800);
			
			et.begin();
			em.merge(c1);
			em.merge(e1);
			et.commit();
			
			System.out.println("record is update");
		}else {
			System.out.println("record not found");
		}
	}
}
