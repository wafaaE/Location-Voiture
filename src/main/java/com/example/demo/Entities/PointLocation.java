package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PointLocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPointLocation;
	private String libelle;
	private String adresse;
	public PointLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PointLocation(int idPointLocation, String libelle, String adresse) {
		super();
		this.idPointLocation = idPointLocation;
		this.libelle = libelle;
		this.adresse = adresse;
	}
	public int getIdPointLocation() {
		return idPointLocation;
	}
	public void setIdPointLocation(int idPointLocation) {
		this.idPointLocation = idPointLocation;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
}
