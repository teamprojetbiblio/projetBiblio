package fr.ib.model;

public class Exemplaire {
	
	//attributs
	private int idEx;
	private String etat;
	private int idLivre;
	
	//constructor
	public Exemplaire(int idEx, String etat, int idLivre) {
		super();
		this.idEx = idEx;
		this.etat = etat;
		this.idLivre = idLivre;
	}

	
	//getters and setters
	public int getIdEx() {
		return idEx;
	}

	public void setIdEx(int idEx) {
		this.idEx = idEx;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public int getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(int idLivre) {
		this.idLivre = idLivre;
	}
	

}
