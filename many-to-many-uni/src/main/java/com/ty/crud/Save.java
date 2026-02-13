package com.ty.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.entity.Actor;
import com.ty.entity.Movie;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Actor a1 = new Actor(2, "suhant", 30);
		
		Movie m1 = new Movie(4, "raabta");
//		Movie m2 = new Movie(2, "ashique");
		
		Movie m2 = em.find(Movie.class, 2);
		
		
//		a1.setMovies(Arrays.asList(m1,m2,m3));
		a1.setMovies(Arrays.asList(m1,m2));
		
		et.begin();
		em.persist(a1);
		em.persist(m1);
		em.persist(m2);
//		em.persist(m3);
		et.commit();
		
		System.out.println("saved");
	}
}
