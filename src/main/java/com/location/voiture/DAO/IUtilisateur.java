package com.location.voiture.DAO;

import java.util.List;

import com.location.voiture.Entities.Reservation;
import com.location.voiture.Entities.Utilisateur;

public interface IUtilisateur {
	
	public Utilisateur creerCompte(Utilisateur utilisateur);
	public boolean seConnecter(String email, String password);
	public List<Reservation> mesReservation(Utilisateur utilisateur);

}
