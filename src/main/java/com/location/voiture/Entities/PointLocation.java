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
@Table(name = "POINT_LOCATION")
public class PointLocation implements Serializable{
		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "ADRESSE")
	private String adresse;
	
	@Column(name = "LIBELLE")
	private String libelle;
	
	@OneToMany(mappedBy = "pointLocation")
	private List<Voiture> voitures;
	
	public PointLocation() {
		super();
	}
	
	public PointLocation(String libelle, String  adresse) {
		super();
		this.libelle = libelle;
		this.adresse = adresse;
	}
	
	public Long getID() {
		return ID;
	}
	public void setID(Long ID) {
		this.ID = ID;
	}
	public List<Voiture> getVoitures() {
		return voitures;
	}
	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
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
