package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parametre {
@Id
private String libelle;
private String valeur;
private String description;

public Parametre() {
	super();
	// TODO Auto-generated constructor stub
}

public Parametre(String libelle, String valeur, String description) {
	super();
	this.libelle = libelle;
	this.valeur = valeur;
	this.description = description;
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
