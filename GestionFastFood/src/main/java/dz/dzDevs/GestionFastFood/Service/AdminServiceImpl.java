package dz.dzDevs.GestionFastFood.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import dz.dzDevs.GestionFastFood.DAO.*;
import dz.dzDevs.GestionFastFood.Entity.*;

@Service("AdminService")
@Transactional
public class AdminServiceImpl implements IAdminService {
	
	protected CommandDAOImpl commandDAOImpl;
	@Autowired
	public AdminServiceImpl(CommandDAOImpl commandDAOImpl) {
	 this.commandDAOImpl = commandDAOImpl;
	}

	protected ProductCategoryDAOImpl productCategoryDAOImpl;
	@Autowired
	public AdminServiceImpl(ProductCategoryDAOImpl productCategoryDAOImpl) {
	 this.productCategoryDAOImpl = productCategoryDAOImpl;
	}

	protected ProductDAOImpl productDAOImpl;
	@Autowired
	public AdminServiceImpl(ProductDAOImpl productDAOImpl) {
	 this.productDAOImpl = productDAOImpl;
	}

	protected FormulaDAOImpl formulaDAOImpl;
	@Autowired
	public AdminServiceImpl(FormulaDAOImpl formulaDAOImpl){
	 this.formulaDAOImpl=formulaDAOImpl;
	}

	protected TablesDAOImpl  tablesDAOImpl;
	@Autowired
	public AdminServiceImpl(TablesDAOImpl  tablesDAOImpl){
	 this.tablesDAOImpl = tablesDAOImpl;
	}

	protected UserDAOImpl userDAOImpl;
	@Autowired
	public AdminServiceImpl(UserDAOImpl userDAOImpl){
	 this.userDAOImpl = userDAOImpl;
	}
	
	protected RoleDAOImpl roleDAOImpl;
	@Autowired
	public AdminServiceImpl(RoleDAOImpl roleDAOImpl){
	 this.roleDAOImpl = roleDAOImpl;
	}

	public void createUser(User user) {
		userDAOImpl.createUser(user);
	}

	public void updateUser(User user) {
		userDAOImpl.updateUser(user);
	}

	public void deleteUser(int idUser) {
		userDAOImpl.deleteUser(idUser);
	}

	public User findUserById(int idUser) {
		return userDAOImpl.findUserById(idUser);
	}

	public User findUserByLogin(String loginUser) {
		return userDAOImpl.findUserByLogin(loginUser);
	}

	public List<User> listUsers() {
		return userDAOImpl.listUsers();
	}

	public void createRole(Role role) {
		roleDAOImpl.createRole(role);
	}

	public void updateRole(Role role) {
		roleDAOImpl.updateRole(role);
	}

	public void deleteRole(int roleId) {
	roleDAOImpl.deleteRole(roleId);
	}

	public Role findRoleById(int roleId) {
		return roleDAOImpl.findRoleById(roleId);
	}

	public Role findRoleByName(String roleName) {
		return roleDAOImpl.findRoleByName(roleName);
	}

	public List<Role> listRoles() {
		return roleDAOImpl.listRoles();
	}

	public void createTable(Tables table) {
	   tablesDAOImpl.createTable(table);
	}

	public void updateTable(Tables table) {
		tablesDAOImpl.updateTable(table);
	}

	public void deleteTable(int tableId) {
		tablesDAOImpl.deleteTable(tableId);
	}

	public Tables findTableById(int tableId) {
		return tablesDAOImpl.findTableById(tableId);
	}

	public List<Tables> listTables() {
		return tablesDAOImpl.listTables();
	}

	public void addProduct(Product product) {
	     productDAOImpl.addProduct(product);
	}

	public void updateProduct(Product product) {
	     productDAOImpl.updateProduct(product);
	}

	public void deleteProduct(int productId) {
		productDAOImpl.deleteProduct(productId);
	}

	public Product findProductById(int productId) {
		return productDAOImpl.findProductById(productId);
	}

	public List<Product> listProducts() {
		return productDAOImpl.listProducts();
	}

	public void createCategory(ProductCategory category) {
		productCategoryDAOImpl.createCategory(category);
	}

	public void updateCategory(ProductCategory category) {
		productCategoryDAOImpl.updateCategory(category);
	}

	public void deleteCategory(int categoryId) {
		productCategoryDAOImpl.deleteCategory(categoryId);
	}

	public ProductCategory findCategoryById(int categoryId) {
		return productCategoryDAOImpl.findCategoryById(categoryId);
	}

	public ProductCategory findCategoryByName(String categoryName) {
		return  productCategoryDAOImpl.findCategoryByName(categoryName);
	}

	public List<ProductCategory> listCategorys() {
		return productCategoryDAOImpl.listCategorys();
	}

	public void createFormula(Formula formula) {
		formulaDAOImpl.createFormula(formula);
	}

	public void updateFormula(Formula formula) {
		formulaDAOImpl.updateFormula(formula);
	}

	public void deleteFormula(int formulaId) {
		formulaDAOImpl.deleteFormula(formulaId);
	}

	public Formula findFormulaById(int formulaId) {
		return formulaDAOImpl.findFormulaById(formulaId);
	}

	public Formula findFormulaByName(String formulaName) {
		return formulaDAOImpl.findFormulaByName(formulaName);
	}

	public List<Formula> listFormulas() {
		return formulaDAOImpl.listFormulas();
	}

	public Command findCommandById(int CommandId) {
		return commandDAOImpl.findCommandById(CommandId);
	}

	public List<Command> listCommands() {
		return commandDAOImpl.listCommands();
	}
}