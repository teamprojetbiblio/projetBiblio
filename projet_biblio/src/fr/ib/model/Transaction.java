package fr.ib.model;

import java.util.Date;

public class Transaction {
	
	//attributs
	private int idTrans;
	
	private Date dateEmprunt;
	private Date dateRetour;
	
	private Exemplaire exemplaire;
	private Adherant adherant;
	
	//constructeurs
	public Transaction() {
		super();
	}
	public Transaction(Date dateEmprunt, Date dateRetour) {
		super();
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
	}
	public Transaction(int idTrans, Date dateEmprunt, Date dateRetour) {
		super();
		this.idTrans = idTrans;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
	}
	
	//get et set
	public int getIdTrans() {
		return idTrans;
	}
	public void setIdTrans(int idTrans) {
		this.idTrans = idTrans;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public Date getDateRetour() {
		return dateRetour;
	}
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}
	public Adherant getAdherant() {
		return adherant;
	}
	public void setAdherant(Adherant adherant) {
		this.adherant = adherant;
	}
	
	//toString
	@Override
	public String toString() {
		return "Transaction [idTrans=" + idTrans + ", dateEmprunt=" + dateEmprunt + ", dateRetour=" + dateRetour + "]";
	}

}
