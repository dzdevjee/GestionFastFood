package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import dz.dzDevs.GestionFastFood.Entity.Tables;

public interface ITablesDAO {
	public void 			createTable(Tables table);
	public void 			updateTable(Tables table);
	public void 			deleteTable(int tableId);
	public Tables 			findTableById(int tableId);
	public List<Tables> 	listTables();
}