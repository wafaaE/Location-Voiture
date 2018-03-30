package com.location.voiture.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id	
	private String email;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "PRENOM")
	private String prenom;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "ADRESSE")
	private String adresse;
	
	@Column(name = "PROFIL")
	private String profil;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Reservation> reservations;
	
	
	public Utilisateur() {
		super();
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
	
	public Utilisateur(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public Utilisateur(String nom, String prenom, String email, String password) {
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
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

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
