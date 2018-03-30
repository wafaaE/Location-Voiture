package com.location.voiture.DAO;

import java.util.List;

import com.location.voiture.Entities.Voiture;

public interface IVoiture {
	
	public void ajoutVoiture(Voiture voiture);
	public void modifVoiture(Voiture voiture);
	public List<Voiture> rechercheVoiture(String motCle);

}
