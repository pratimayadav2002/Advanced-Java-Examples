package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Car;
import com.ty.entity.Engine;

public class Save {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Car c1 = new Car(3,"pqr",5500000);
	
	Engine e1 = new Engine(33,"k",900);
	c1.setEngine(e1);

	et.begin();
	em.persist(c1);
	em.persist(e1);
	et.commit();
	
	System.out.println("record saved");
}
}
