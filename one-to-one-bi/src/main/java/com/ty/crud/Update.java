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
		
//		Car c1 = em.find(Car.class, 1);
		
		Engine e1 = em.find(Engine.class, 11);
		
		if(e1 != null) {
//			updated record of engine
			e1.setCc(800);
			
			et.begin();
			em.merge(e1);
			et.commit();
			
			// updated record of car 
//			if (c1 != null) {
//			c1.setBrand("mercedes");
//			
//			et.begin();
//			em.merge(c1);
//			et.commit();
			
			System.out.println("updated");

			
		} else {
			System.out.println("not found");
		}
		
	}
}
