package dz.dzDevs.GestionFastFood.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMMAND")
public class Command implements Serializable  {
	private static final long serialVersionUID = -749956242538332857L;

	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commandId ;
// TODO ajouter num command ??
	@Column(name = "commandDate")
	private Date commandDate;
	@Column(name = "commandType")
	private String commandType;
	@Column(name = "commandTotal")
	private double commandTotal;
	@Column(name = "commandState")
	private String commandState;
	// TODO faire l'annotation
	@OneToMany(mappedBy="command")
	private List<User> listUsers;
	@OneToMany(mappedBy="formulaId")
	private List<Formula> listFormulas;
	@OneToMany(mappedBy="productId")
	private List<Product> listProducts;
	
	@OneToMany(mappedBy="tableId")
	private List<Tables> tables;

	public String getCommandType() {
		return commandType;
	}
	public Date getCommandDate() {
		return commandDate;
	}
	public void setCommandDate(Date commandDate) {
		this.commandDate = commandDate;
	}
	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}
	public double getCommandTotal() {
		return commandTotal;
	}
	public void setCommandTotal(double commandTotal) {
		this.commandTotal = commandTotal;
	}
	public String getCommandState() {
		return commandState;
	}
	public void setCommandState(String commandState) {
		this.commandState = commandState;
	}
	public List<User> getListUsers() {
		return listUsers;
	}
	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}
	public List<Formula> getListFormulas() {
		return listFormulas;
	}
	public void setListFormulas(List<Formula> listFormulas) {
		this.listFormulas = listFormulas;
	}
	public List<Product> getListProducts() {
		return listProducts;
	}
	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}
	public int getCommandId() {
		return commandId;
	}
}