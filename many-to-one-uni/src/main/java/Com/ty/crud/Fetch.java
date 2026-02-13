package Com.ty.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Com.ty.entity.Product;
import Com.ty.entity.Review;

public class Fetch {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	
	Review r1 = em.find(Review.class, 1);
	
	if( r1 != null) {
		System.out.println("------review------");
		System.out.println(r1.getRid());
		System.out.println(r1.getMsg());
		System.out.println(r1.getProduct());
		
		Product p1 = r1.getProduct();
		System.out.println("-------product------");
		System.out.println(p1.getName());
		System.out.println(p1.getPid());
		System.out.println(p1.getDescription());
		System.out.println(p1.getPrice());
		
		
	}else {
		System.out.println("not found");
	}

}
}
