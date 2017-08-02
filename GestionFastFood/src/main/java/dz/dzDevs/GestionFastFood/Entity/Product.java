package dz.dzDevs.GestionFastFood.Entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;

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

	public Product () {
	}

	public int getProductId() {
		return productId;
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