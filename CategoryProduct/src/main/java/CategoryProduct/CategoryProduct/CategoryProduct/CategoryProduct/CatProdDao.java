package CategoryProduct.CategoryProduct.CategoryProduct.CategoryProduct;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CatProdDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public boolean saveProduct(ProductEntity product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean add = false;
		if (product != null) {
			System.out.println(product);
			session.save(product);
			transaction.commit();
			add = true;
			session.close();
		}
		return add;
	}

	public List<ProductEntity> getAllProductEntity() {
		Session session = sessionFactory.openSession();
		List listProductEntity = session.createCriteria(ProductEntity.class).list();
		
		return listProductEntity;
	}

	public String ProductEntityDelete(String id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		ProductEntity ProductEntity  = session.get(ProductEntity.class, id);
		session.delete(ProductEntity);
		transaction.commit();
		session.close();
		return "ProductEntityDelete" ;
		
		
	}

	public String ProductEntityUpdate(ProductEntity productentity) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(productentity);
		transaction.commit();
		session.close();

		return "ProductEntityUpdate";

	}

}
