package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import dz.dzDevs.GestionFastFood.Entity.Formula;

public interface IFormulaDAO {
	public void 			createFormula(Formula formula);
	public void 			updateFormula(Formula formula);
	public void 			deleteFormula(int formulaId);
	public Formula 			findFormulaById(int formulaId);
	public Formula 			findFormulaByName(String formulaName);
	public List<Formula> 	listFormulas();
}