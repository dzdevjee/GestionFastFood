package dz.dzDevs.GestionFastFood.Entity;

import java.sql.Date;
import java.util.List;

public class Commande {
private int idCommande ;
private  Date dateCommande;
private String typeCommande;
private double totalCommande;
private String etatCommande;
private List<Formule> listFormule;
/*formule have produits why commande have formule and produits*/
private List<Produit> listProduits;
private List<User> listUser;
/*why reperesnt by int not by reference of class table*/
private int idTable ;
public int getIdCommande() {
	return idCommande;
}
public void setIdCommande(int idCommande) {
	this.idCommande = idCommande;
}
public Date getDateCommande() {
	return dateCommande;
}
public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}
public String getTypeCommande() {
	return typeCommande;
}
public void setTypeCommande(String typeCommande) {
	this.typeCommande = typeCommande;
}
public double getTotalCommande() {
	return totalCommande;
}
public void setTotalCommande(double totalCommande) {
	this.totalCommande = totalCommande;
}
public String getEtatCommande() {
	return etatCommande;
}
public void setEtatCommande(String etatCommande) {
	this.etatCommande = etatCommande;
}
public List<Formule> getListFormule() {
	return listFormule;
}
public void setListFormule(List<Formule> listFormule) {
	this.listFormule = listFormule;
}
public List<Produit> getListProduits() {
	return listProduits;
}
public void setListProduits(List<Produit> listProduits) {
	this.listProduits = listProduits;
}
public List<User> getListUser() {
	return listUser;
}
public Commande(int idCommande, Date dateCommande, String typeCommande, double totalCommande, String etatCommande,
		List<Formule> listFormule, List<Produit> listProduits, List<User> listUser, int idTable) {
	super();
	this.idCommande = idCommande;
	this.dateCommande = dateCommande;
	this.typeCommande = typeCommande;
	this.totalCommande = totalCommande;
	this.etatCommande = etatCommande;
	this.listFormule = listFormule;
	this.listProduits = listProduits;
	this.listUser = listUser;
	this.idTable = idTable;
}
public void setListUser(List<User> listUser) {
	this.listUser = listUser;
}
public int getIdTable() {
	return idTable;
}
public void setIdTable(int idTable) {
	this.idTable = idTable;
}

}
