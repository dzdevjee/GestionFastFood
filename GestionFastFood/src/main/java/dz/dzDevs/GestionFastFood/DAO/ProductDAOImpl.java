package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import org.hibernate.Session;
import dz.dzDevs.GestionFastFood.Entity.Product;
import dz.dzDevs.GestionFastFood.Util.HibernateUtil;

public  class ProductDAOImpl implements IProductDAO {
	private Session session = HibernateUtil.openSession();

	public void addProduct(Product product) {
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
	}

	public void updateProduct(Product product) {
		session.beginTransaction();
		session.merge(product);
		session.getTransaction().commit();
	}

	public void deleteProduct(int productId) {
		session.beginTransaction();
		Product product = findProductById(productId);
		session.delete(product);
		session.getTransaction().commit();
	}

	public Product findProductById(int productId) {
		return (Product)session.get(Product.class, productId);
	}

	public List<Product> listProducts() {
		return session.createQuery("select o from Product o").list();
	}
}