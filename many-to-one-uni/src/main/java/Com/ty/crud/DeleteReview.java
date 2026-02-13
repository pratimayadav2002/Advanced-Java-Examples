package Com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Com.ty.entity.Review;

public class DeleteReview {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Review r1 = em.find(Review.class, 3);
		
		if(r1 != null) {
			et.begin();
			em.remove(r1);
			et.commit();
			
			System.out.println("record deleted");
		}else {
			System.out.println("not found");
		}
		
	}
}
