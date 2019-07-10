package fr.ib.model;

public class Categorie {
	
	//attributs
	private int idCat;
	private String nom;
	
	//constructeurs
	public Categorie() {
		super();
	}
	public Categorie(String nom) {
		super();
		this.nom = nom;
	}
	public Categorie(int idCat, String nom) {
		super();
		this.idCat = idCat;
		this.nom = nom;
	}
	
	
	//getters et setters
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
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
		return "Categorie [idCat=" + idCat + ", nom=" + nom + "]";
	}
		
	
	

}
