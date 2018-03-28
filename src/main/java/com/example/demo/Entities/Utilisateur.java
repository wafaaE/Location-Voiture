package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utilisateur {
@Id	
private String email;
private String nom;
private String prenom;
private String password;
private String adresse;
private String profil;
public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}
public Utilisateur(String email, String nom, String prenom, String password, String adresse, String profil) {
	super();
	this.email = email;
	this.nom = nom;
	this.prenom = prenom;
	this.password = password;
	this.adresse = adresse;
	this.profil = profil;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
public void setPrenom(String prenom) {
	this.prenom = prenom;
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
public String getProfil() {
	return profil;
}
public void setProfil(String profil) {
	this.profil = profil;
}


}
