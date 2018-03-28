package com.example.demo.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idReservation;
private Date dateReservation;
private Date dateRetour;
private int duree;
private int idVoiture;
private String emailUtilisateur;
public Reservation() {
	super();
	// TODO Auto-generated constructor stub
}
public Reservation(Date dateReservation, Date dateRetour, int duree, int idVoiture, String emailUtilisateur) {
	super();
	this.dateReservation = dateReservation;
	this.dateRetour = dateRetour;
	this.duree = duree;
	this.idVoiture = idVoiture;
	this.emailUtilisateur = emailUtilisateur;
}
public int getIdReservation() {
	return idReservation;
}
public void setIdReservation(int idReservation) {
	this.idReservation = idReservation;
}
public Date getDateReservation() {
	return dateReservation;
}
public void setDateReservation(Date dateReservation) {
	this.dateReservation = dateReservation;
}
public Date getDateRetour() {
	return dateRetour;
}
public void setDateRetour(Date dateRetour) {
	this.dateRetour = dateRetour;
}
public int getDuree() {
	return duree;
}
public void setDuree(int duree) {
	this.duree = duree;
}
public int getIdVoiture() {
	return idVoiture;
}
public void setIdVoiture(int idVoiture) {
	this.idVoiture = idVoiture;
}
public String getEmailUtilisateur() {
	return emailUtilisateur;
}
public void setEmailUtilisateur(String emailUtilisateur) {
	this.emailUtilisateur = emailUtilisateur;
}


}
