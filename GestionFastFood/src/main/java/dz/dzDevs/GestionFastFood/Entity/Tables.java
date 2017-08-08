package dz.dzDevs.GestionFastFood.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABLES")

public class Tables implements Serializable  {
	private static final long serialVersionUID = 5936727274154423920L;

	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tableId;
	@Column(name = "tableName")
    private String tableName;
	@Column(name = "tableSeats")
    private int tableSeats;

	public int getTableId() {
		return tableId;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public int getTableSeats() {
		return tableSeats;
	}
	public void setTableSeats(int tableSeats) {
		this.tableSeats = tableSeats;
	}
}