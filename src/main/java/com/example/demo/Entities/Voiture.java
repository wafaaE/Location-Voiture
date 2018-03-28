package com.example.demo.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVoiture;
	private String libelle;
	private String description;
	private String defauts;
	private double prix;
	private double amende;
	private double caution;
	private int idPointLocation;
	
	// For JPA
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voiture(String libelle, String description, String defauts, double prix, double amende,
			double caution, int idPointLocation) {
		super();
		this.libelle = libelle;
		this.description = description;
		this.defauts = defauts;
		this.prix = prix;
		this.amende = amende;
		this.caution = caution;
		this.idPointLocation = idPointLocation;
	}

	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefauts() {
		return defauts;
	}

	public void setDefauts(String defauts) {
		this.defauts = defauts;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getAmende() {
		return amende;
	}

	public void setAmende(double amende) {
		this.amende = amende;
	}

	public double getCaution() {
		return caution;
	}

	public void setCaution(double caution) {
		this.caution = caution;
	}

	public int getIdPointLocation() {
		return idPointLocation;
	}

	public void setIdPointLocation(int idPointLocation) {
		this.idPointLocation = idPointLocation;
	}
	
	
}
