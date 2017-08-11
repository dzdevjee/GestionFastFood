package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import dz.dzDevs.GestionFastFood.Entity.Product;

public interface IProductDAO {
	public void 			addProduct(Product product);
	public void 			updateProduct(Product product);
	public void 			deleteProduct(int productId);
	public Product 			findProductById(int productId);
	public List<Product> 	listProducts();
}