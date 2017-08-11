package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import org.hibernate.Session;
import dz.dzDevs.GestionFastFood.Entity.Tables;
import dz.dzDevs.GestionFastFood.Util.HibernateUtil;

public class TablesDAOImpl implements ITablesDAO {
	private Session session = HibernateUtil.openSession();

	public void createTable(Tables table) {
		session.beginTransaction();
		session.save(table);
        session.getTransaction().commit();
	}

	public void updateTable(Tables table) {
		session.beginTransaction();
		session.merge(table);
        session.getTransaction().commit();
	}

	public void deleteTable(int tableId) {
		session.beginTransaction();
		Tables table = findTableById(tableId);
		session.delete(table);
        session.getTransaction().commit();		
	}

	public Tables findTableById(int tableId) {
		return (Tables)session.get(Tables.class, tableId);
	}

	public List<Tables> listTables() {
		return session.createQuery("select o from Tables o").list();
	}
}