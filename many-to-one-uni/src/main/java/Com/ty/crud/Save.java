package Com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Com.ty.entity.Product;
import Com.ty.entity.Review;

public class Save {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product p1 = new Product(11, "Phone", 25000, "8gb, 128gb storage");
		
		Review r1 = new Review(1, "best");
		Review r2 = new Review(2, "good");
		Review r3 = new Review(3, "bad");
		
		r1.setProduct(p1);
		r2.setProduct(p1);
		r3.setProduct(p1);
		
		et.begin();
		em.persist(p1);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		et.commit();
		
		System.out.println("saved");
	}
}
