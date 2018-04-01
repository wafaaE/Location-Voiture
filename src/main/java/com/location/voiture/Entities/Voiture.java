package com.location.voiture.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Voiture implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(name = "IMMATRICULATION")
	private String immatricule;
	
	@Column(name = "MARQUE")
	private String marque;
	
	@Column(name = "DEFAUTS")
	private String defauts;
	
	@Column(name = "PRIX")
	private double prix;
	
	@Column(name = "AMANDE")
	private double amende;
	
	@Column(name = "CAUTION")
	private double caution;
	
	@Column(name="DISPONIBILITE")
	private boolean disponibilite;
	
	@ManyToOne
	@JoinColumn(name = "ID_RESERVATION")
	private Reservation reservation;
	
	@ManyToOne
	@JoinColumn(name = "ID_POINT_LOCATION")
	private PointLocation pointLocation;
	
	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public void setPointLocation(PointLocation pointLocation) {
		this.pointLocation = pointLocation;
	}

	public Voiture() {
		super();
	}

	public Voiture(String immatricule, String marque, String defauts, double prix, double amende,
			double caution) {
		super();
		this.immatricule = immatricule;
		this.marque = marque;
		this.defauts = defauts;
		this.prix = prix;
		this.amende = amende;
		this.caution = caution;
	}
	
	public Voiture(String immatricule, String marque) {
		super();
		this.immatricule = immatricule;
		this.marque = marque;
	}
	

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getImmatricule() {
		return immatricule;
	}

	public void setImmatricule(String immatricule) {
		this.immatricule = immatricule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
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

	public PointLocation getPointLocation() {
		return pointLocation;
	}

	public void setIdPointLocation(PointLocation pointLocation) {
		this.pointLocation = pointLocation;
	}
	
	@Override
	public String toString() {
		return "Voiture [ " + this.immatricule +" "+ this.marque +" ]";
	}

}