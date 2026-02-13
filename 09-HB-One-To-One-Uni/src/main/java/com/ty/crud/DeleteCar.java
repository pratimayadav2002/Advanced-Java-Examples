package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Car;

public class DeleteCar {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Car c1 = em.find(Car.class, 3);
	if (c1 != null) {
		et.begin();
		em.remove(c1);
		et.commit();
		
		System.out.println("record deleted");
	}else {
		System.out.println("not found record");
	}
}
}
