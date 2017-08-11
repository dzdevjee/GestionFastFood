package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import dz.dzDevs.GestionFastFood.Entity.ProductCategory;

public interface IProductCategoryDAO {
	public void 					createCategory(ProductCategory category);
	public void 					updateCategory(ProductCategory category);
	public void 					deleteCategory(int categoryId);
	public ProductCategory 			findCategoryById(int categoryId);
	public ProductCategory 			findCategoryByName(String categoryName);
	public List<ProductCategory> 	listCategorys();
}