package com.location.voiture.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.voiture.Entities.Voiture;

public interface VoitureRepository 
         extends JpaRepository<Voiture, Integer> {
}
