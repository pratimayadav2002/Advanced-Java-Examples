package com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.entity.Actor;
import com.ty.entity.Movie;

public class Fetch {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Actor a1 = em.find(Actor.class, 1);
		
		if (a1 != null) {
			System.out.println("-------actor-------");
			System.out.println(a1.getAid());
			System.out.println(a1.getName());
			System.out.println(a1.getAge());
			
			List<Movie> m1 = a1.getMovies();
			System.out.println("------movies-------");
			for (Movie movie : m1) {
				System.out.println(movie.getMid());
				System.out.println(movie.getTitle());
				System.out.println("===============");
			}
		} else {

		}
		
		
		
	}
}
