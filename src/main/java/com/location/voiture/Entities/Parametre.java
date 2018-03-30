package com.location.voiture.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PARAMETRE")
public class Parametre implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "LIBELLE")
	private String libelle;
	
	@Column(name = "VALEUR")
	private String valeur;
	
	@Column(name = "DESCRIPTION")
	private String description;


	public Parametre() {
		super();
	}

	public Parametre(String libelle, String valeur, String description) {
		super();
		this.libelle = libelle;
		this.valeur = valeur;
		this.description = description;
	}
	
	public Parametre(String libelle, String valeur) {
		super();
		this.libelle = libelle;
		this.valeur = valeur;
	}
	
	

	public Long getID() {
		return ID;
	}

	public void setID(Long ID) {
		this.ID = ID;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
