package dz.dzDevs.GestionFastFood.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	  @ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="commandId")
	  private Command command;
	public int getTableId() {
		return tableId;
	}
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
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