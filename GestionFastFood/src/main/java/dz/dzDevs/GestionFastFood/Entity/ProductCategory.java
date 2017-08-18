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
@Table(name = "PRODUCTCATEGORY")
public class ProductCategory implements Serializable {
	private static final long serialVersionUID = -1872213744634892582L;

	//Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryId;
	@Column(name="nomCat")
	private String categoryName;
	 @OneToMany(mappedBy="category")
	 List<Product> listproducts;
	public ProductCategory() {
	}
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}