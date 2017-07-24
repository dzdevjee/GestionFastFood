package dz.gestionFastFood.Entites;

public class Menu {
	private int 	idMenu;
	private String 	nomMenu;
	private int 	nbrMenuItems;

	public int getIdMenu() {
		return idMenu;
	}
	public void setNomMenu(String nomMenu) {
		this.nomMenu = nomMenu;
	}
	public String getNomMenu() {
		return nomMenu;
	}
	public void setNbrMenuItems(int nbrMenuItems) {
		this.nbrMenuItems = nbrMenuItems;
	}
	public int getNbrMenuItems() {
		return nbrMenuItems;
	}
}