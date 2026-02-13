package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Car;
import com.ty.entity.Engine;

public class Fetch {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Car c1 = em.find(Car.class, 1);
		
		if (c1 != null) {
			System.out.println("-----car------");
			System.out.println(c1.getCid());
			System.out.println(c1.getBrand());
			System.out.println(c1.getPrice());
			
			Engine e1 = c1.getEngine();
			
			System.out.println("-----engine-----");
			System.out.println(e1.getEid());
			System.out.println(e1.getFuel());
			System.out.println(e1.getCc());
		}else {
			System.out.println("record not found");
		}
		
	}
}
