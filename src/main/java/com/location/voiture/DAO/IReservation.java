package com.location.voiture.DAO;

import java.util.Date;

import com.location.voiture.Entities.Reservation;
import com.location.voiture.Entities.Voiture;

public interface IReservation {
	
	public Reservation louer(Voiture voiture, Date dateDebut, int duree);
	public boolean annulerReservation(Long idReservation);
	public Reservation modifDureeReservation(Reservation reservation,Date nvlDateDeb, int nvlDuree);

}
