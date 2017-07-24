package dz.gestionFastFood.Entites;

public class Table {
	private int 	idTable;
	private String 	nomTable;
	private int 	nbrAssise;
	private String 	positionnementTable;

	public int getIdTable() {
		return idTable;
	}
	public String getNomTable() {
		return nomTable;
	}
	public void setNomTable(String nomTable) {
		this.nomTable = nomTable;
	}
	public int getNbrAssise() {
		return nbrAssise;
	}
	public void setNbrAssise(int nbrAssise) {
		this.nbrAssise = nbrAssise;
	}
	public String getPositionnementTable() {
		return positionnementTable;
	}
	public void setPositionnementTable(String positionnementTable) {
		this.positionnementTable = positionnementTable;
	}
}