package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import dz.dzDevs.GestionFastFood.Entity.ProductCategory;

public interface IProductCategoryDAO {
	public void 					createCategory(ProductCategory category);
	public void 					updateProductCategory(ProductCategory category);
	public void 					deleteProductCategory(int categoryId);
	public ProductCategory 			findProductCategoryById(int categoryId);
	public ProductCategory 			findProductCategoryByName(String categoryName);
	public List<ProductCategory> 	listProductCategorys();
}