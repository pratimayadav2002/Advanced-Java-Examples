package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Car;
import com.ty.entity.Engine;

public class FetchByEngine {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	Engine e1 = em.find(Engine.class, 11);
	
	if (e1 != null) {
		System.out.println("-----engine-----");
		System.out.println(e1.getEid());
		System.out.println(e1.getCc());
		System.out.println(e1.getFuel());
		
		Car c1 = e1.getCar();
		System.out.println("------car------");
		System.out.println(c1.getCid());
		System.out.println(c1.getBrand());
		System.out.println(c1.getPrice());
		
	} else {
		System.out.println("not found");
	}
	
}
}
