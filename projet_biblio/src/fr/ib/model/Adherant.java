package fr.ib.model;

public class Adherant {
int id;
String password;
String nom;
String prenom;
String adresse;
String ville;
String email;
String telephone;

	public Adherant(String password,String nom, String prenom,String adresse,String ville,String email,String telephone) {
	this.password = password;
	this.telephone = telephone;
	this.prenom = prenom;
	this.nom= nom;
	this.adresse = adresse;
	this.ville = ville;
	this.email = email;
	this.telephone = telephone;
	
	}
	public Adherant() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [prenom=" + prenom + ", name=" + nom+ ", password=" + password + ", adresse=" + adresse+ ", ville=" + ville+  ", email=" + email+ ", téléphone=" + telephone+"]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setName(String prenom) {
		this.prenom =prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return password;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEmaile() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
