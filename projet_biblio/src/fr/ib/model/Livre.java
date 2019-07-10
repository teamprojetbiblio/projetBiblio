package fr.ib.model;

public class Livre {
	
	//attribute
	private int idLivre;
	private String titre;
	private int isbn;
	private int idAuteur;
	private int idEditeur;
	private int idCategorie;
	
	//constructeur
	public Livre(int idLivre, String titre, int isbn, int idAuteur, int idEditeur, int id) {
		super();
		this.idLivre = idLivre;
		this.titre = titre;
		this.isbn = isbn;
		this.idAuteur = idAuteur;
		this.idEditeur = idEditeur;
		this.idCategorie = id;
	}

	public int getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getIdAuteur() {
		return idAuteur;
	}

	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
	}

	public int getIdEditeur() {
		return idEditeur;
	}

	public void setIdEditeur(int idEditeur) {
		this.idEditeur = idEditeur;
	}

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

}
