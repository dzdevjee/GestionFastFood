package dz.dzDevs.GestionFastFood.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.Formula;
import dz.dzDevs.GestionFastFood.Entity.Product;
import dz.dzDevs.GestionFastFood.Entity.ProductCategory;
import dz.dzDevs.GestionFastFood.Entity.Role;
import dz.dzDevs.GestionFastFood.Entity.Tables;
import dz.dzDevs.GestionFastFood.Entity.User;

@Service("AdminService")
@Transactional
public class AdminServiceImpl implements IAdminService {

	public void createUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(int idUser) {
		// TODO Auto-generated method stub
		
	}

	public User findUserById(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByLogin(String loginUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createRole(Role role) {
		// TODO Auto-generated method stub
		
	}

	public void updateRole(Role role) {
		// TODO Auto-generated method stub
		
	}

	public void deleteRole(int roleId) {
		// TODO Auto-generated method stub
		
	}

	public Role findRoleById(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Role findRoleByName(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Role> listRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createTable(Tables table) {
		// TODO Auto-generated method stub
		
	}

	public void updateTable(Tables table) {
		// TODO Auto-generated method stub
		
	}

	public void deleteTable(int tableId) {
		// TODO Auto-generated method stub
		
	}

	public Tables findTableById(int tableId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Tables> listTables() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}

	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createCategory(ProductCategory category) {
		// TODO Auto-generated method stub
		
	}

	public void updateCategory(ProductCategory category) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		
	}

	public ProductCategory findCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductCategory findCategoryByName(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProductCategory> listCategorys() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createFormula(Formula formula) {
		// TODO Auto-generated method stub
		
	}

	public void updateFormula(Formula formula) {
		// TODO Auto-generated method stub
		
	}

	public void deleteFormula(int formulaId) {
		// TODO Auto-generated method stub
		
	}

	public Formula findFormulaById(int formulaId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Formula findFormulaByName(String formulaName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Formula> listFormulas() {
		// TODO Auto-generated method stub
		return null;
	}

	public Command findCommandById(int CommandId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Command> listCommands() {
		// TODO Auto-generated method stub
		return null;
	}

}
