package com.location.voiture.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.voiture.Entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, String>{
	Utilisateur findByEmail(String email);
}
