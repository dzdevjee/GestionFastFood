package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import org.hibernate.Session;
import dz.dzDevs.GestionFastFood.Entity.Formula;
import dz.dzDevs.GestionFastFood.Util.HibernateUtil;

public class FormulaDAOImpl implements IFormulaDAO {
	private Session session = HibernateUtil.openSession();

	public void createFormula(Formula formula) {
		session.beginTransaction();
		session.save(formula);
        session.getTransaction().commit();
	}

	public void updateFormula(Formula formula) {
		session.beginTransaction();
		session.merge(formula);
        session.getTransaction().commit();
	}

	public void deleteFormula(int formulaId) {
		session.beginTransaction();
		Formula formula = findFormulaById(formulaId);
		session.delete(formula);
        session.getTransaction().commit();	
	}

	public Formula findFormulaById(int formulaId) {
		return (Formula)session.get(Formula.class, formulaId);
	}

	public Formula findFormulaByName(String formulaName) {
		System.out.println("En cours de realisation...");
		return null;
	}

	public List<Formula> listFormulas() {
		return session.createQuery("select o from Formula o").list();
	}
}