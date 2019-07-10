package fr.ib.model;

public class Auteur {
	
//attributs	
private int idAut;
private String nom;

//constructeurs
public Auteur() {
	super();
}

public Auteur(String nom) {
	super();
	this.nom = nom;
}


public Auteur(int idAut, String nom) {
	super();
	this.idAut = idAut;
	this.nom = nom;
}


//getters et setters
public int getIdAut() {
	return idAut;
}

public void setIdAut(int idAut) {
	this.idAut = idAut;
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
	return "Auteur [idAut=" + idAut + ", nom=" + nom + "]";
}


}
