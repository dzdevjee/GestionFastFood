package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import org.hibernate.Session;
import dz.dzDevs.GestionFastFood.Entity.ProductCategory;
import dz.dzDevs.GestionFastFood.Util.HibernateUtil;

public class ProductCategoryDAOImpl implements IProductCategoryDAO {
	private Session session = HibernateUtil.openSession();

	public void createCategory(ProductCategory category) {
		session.beginTransaction();
		session.save(category);
		session.getTransaction().commit();		
	}

	public void updateCategory(ProductCategory category) {
		session.beginTransaction();
		session.merge(category);
		session.getTransaction().commit();
	}

	public void deleteCategory(int categoryId) {
		session.beginTransaction();
		ProductCategory category = findCategoryById(categoryId);
		session.delete(category);
		session.getTransaction().commit();
	}

	public ProductCategory findCategoryById(int categoryId) {
		return (ProductCategory)session.get(ProductCategory.class, categoryId);

	}

	public ProductCategory findCategoryByName(String categoryName) {
		System.out.println("En cours de realisation...");
		return null;
	}

	public List<ProductCategory> listCategorys() {
		return session.createQuery("select o from ProductCategory o").list();
	}
}