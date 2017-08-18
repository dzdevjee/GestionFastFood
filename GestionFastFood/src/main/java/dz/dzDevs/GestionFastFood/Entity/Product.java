package dz.dzDevs.GestionFastFood.Entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {
	private static final long serialVersionUID = 7366732302654051038L;

	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "productPrice")
	private double productPrice;
	@Column(name = "productQteStock")
	private int productQteStock;
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private ProductCategory category;
	  @ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="commandId")
	  private Command command;
	public Product () {
	}

	public int getProductId() {
		return productId;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQteStock() {
		return productQteStock;
	}
	public void setProductQteStock(int productQteStock) {
		this.productQteStock = productQteStock;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setProductCategory(ProductCategory category) {
		this.category = category;
	}
}