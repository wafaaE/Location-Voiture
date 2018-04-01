package com.location.voiture.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.location.voiture.Entities.Voiture;

public interface VoitureRepository 
         extends JpaRepository<Voiture, Long> {
	
	@Query("select e from Voiture e where e.disponibilite = 1")	
	public List<Voiture> disponibiliteVoiture(); 
}
