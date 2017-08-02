package dz.dzDevs.GestionFastFood.Entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Table")
public class TheTable {
    private int tableId;
    private String tableName;
    private int nomreAssiseTable;
	
public TheTable(int tableId, String tableName, int nomreAssiseTable) {
		
		this.tableId = tableId;
		this.tableName = tableName;
		this.nomreAssiseTable = nomreAssiseTable;
	}
public TheTable(){

}
        public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public int getNomreAssiseTable() {
		return nomreAssiseTable;
	}
	public void setNomreAssiseTable(int nomreAssiseTable) {
		this.nomreAssiseTable = nomreAssiseTable;
	}
	
	

}
