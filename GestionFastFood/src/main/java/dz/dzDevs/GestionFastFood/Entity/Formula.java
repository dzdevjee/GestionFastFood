package dz.dzDevs.GestionFastFood.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FORMULA")
public class Formula implements Serializable {
	private static final long serialVersionUID = -8198745535668353408L;

	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int formulaId;
	@Column(name = "formulaName")
	private String formulaName;
	@Column(name = "formulaPrice")
	private Double formulaPrice;
	@OneToMany(mappedBy="productId")
	private List<Product> listProducts;
	  @ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="commandId")
	  private Command command;
//	private List<Product> listProducts;

	public Command getCommand() {
		return command;
	}


	public void setCommand(Command command) {
		this.command = command;
	}


	public String getFormulaName() {
		return formulaName;
	}


	public void setFormulaName(String formulaName) {
		this.formulaName = formulaName;
	}


	public Double getFormulaPrice() {
		return formulaPrice;
	}


	public void setFormulaPrice(Double formulaPrice) {
		this.formulaPrice = formulaPrice;
	}


	public List<Product> getListProducts() {
		return listProducts;
	}


	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}


	public int getFormulaId() {
		return formulaId;
	}


//	public Product getProductId() {
//		return productId;
//	}


//	public void setProductId(Product productId) {
//		this.productId = productId;
//	}

}