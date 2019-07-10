package fr.ib.model;

public class Editeur {

	//attributs
private int idEdi;
private String nom;

//constructeurs
public Editeur() {
	super();
}
public Editeur(String nom) {
	super();
	this.nom = nom;
}
public Editeur(int idEdi, String nom) {
	super();
	this.idEdi = idEdi;
	this.nom = nom;
}

//getters et setters
public int getIdEdi() {
	return idEdi;
}
public void setIdEdi(int idEdi) {
	this.idEdi = idEdi;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}

//toString
@Override
public String toString() {
	return "Editeur [idEdi=" + idEdi + ", nom=" + nom + "]";
}



}
