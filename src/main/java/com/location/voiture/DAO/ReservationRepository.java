package com.location.voiture.DAO;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.location.voiture.Entities.Reservation;
import com.location.voiture.Entities.Utilisateur;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
	public List<Reservation> findByUtilisateur(Utilisateur u);
	public Page<Reservation> findByUtilisateur(String n, Pageable pageable);
	
}
