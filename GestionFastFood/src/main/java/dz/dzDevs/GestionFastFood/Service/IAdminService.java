package dz.dzDevs.GestionFastFood.Service;

import java.util.List;
import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.Formula;
import dz.dzDevs.GestionFastFood.Entity.Product;
import dz.dzDevs.GestionFastFood.Entity.ProductCategory;
import dz.dzDevs.GestionFastFood.Entity.Role;
import dz.dzDevs.GestionFastFood.Entity.Tables;
import dz.dzDevs.GestionFastFood.Entity.User;

public interface IAdminService {
	// Gestion des users
	public void 					createUser(User user);
	public void 					updateUser(User user);
	public void 					deleteUser(int idUser);
	public User 					findUserById(int idUser);
	public User 					findUserByLogin(String loginUser);
	public List<User> 				listUsers();

	// Gestion des roles
	public void 					createRole(Role role);
	public void 					updateRole(Role role);
	public void 					deleteRole(int roleId);
	public Role 					findRoleById(int roleId);
	public Role 					findRoleByName(String roleName);
	public List<Role> 				listRoles();

	// Gestion des tables
	public void 					createTable(Tables table);
	public void 					updateTable(Tables table);
	public void 					deleteTable(int tableId);
	public Tables 					findTableById(int tableId);
	public List<Tables> 			listTables();

	// Gestion des produits
	public void 					addProduct(Product product);
	public void 					updateProduct(Product product);
	public void 					deleteProduct(int productId);
	public Product 					findProductById(int productId);
	public List<Product> 			listProducts();

	// Gestion des categories
	public void 					createCategory(ProductCategory category);
	public void 					updateCategory(ProductCategory category);
	public void 					deleteCategory(int categoryId);
	public ProductCategory 			findCategoryById(int categoryId);
	public ProductCategory 			findCategoryByName(String categoryName);
	public List<ProductCategory> 	listCategorys();

	// Gestion des formules
	public void 					createFormula(Formula formula);
	public void 					updateFormula(Formula formula);
	public void 					deleteFormula(int formulaId);
	public Formula		 			findFormulaById(int formulaId);
	public Formula 					findFormulaByName(String formulaName);
	public List<Formula> 			listFormulas();

	// Gestion des commandes
	public Command 					findCommandById(int CommandId);
	public List<Command> 			listCommands();
}