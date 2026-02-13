package Com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Com.ty.entity.Product;
import Com.ty.entity.Review;

public class Update {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
//	Review r1 = em.find(Review.class, 1);
	Product p1 = em.find(Product.class, 11);
	
//	if(r1 != null) {
//		r1.setMsg("average");
//		
//		et.begin();
//		em.merge(r1);
//		et.commit();
//		
//		System.out.println("record updated");
//	}else {
//		System.out.println("not found");
//	}
	
	if(p1 != null) {
		p1.setPrice(800000D);
		
		et.begin();
		em.merge(p1);
		et.commit();
		
		System.out.println("record updated");
		
	}else {
		System.out.println("not found");
	}
}
}
