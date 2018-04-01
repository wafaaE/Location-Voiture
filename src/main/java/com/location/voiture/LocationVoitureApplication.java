package com.location.voiture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.location.voiture.DAO.UtilisateurRepository;
import com.location.voiture.DAO.VoitureRepository;
import com.location.voiture.Entities.Utilisateur;
import com.location.voiture.Entities.Voiture;

@SpringBootApplication
public class LocationVoitureApplication {

	public static void main(String[] args)  {
		ApplicationContext ctx=SpringApplication.run(LocationVoitureApplication.class, args);
		
		UtilisateurRepository utilisateurRepository=ctx.getBean(UtilisateurRepository.class);
		BCryptPasswordEncoder bCryptPasswordEncoder=ctx.getBean(BCryptPasswordEncoder.class);
		
		//CREATE ADMIN ACCOUNT
		Utilisateur admin = new Utilisateur();
		admin.setEmail("admin");
		admin.setPassword(bCryptPasswordEncoder.encode("admin"));
		admin.setEnabled(true);
		admin.setProfil("ADMIN");
		utilisateurRepository.save(admin);
	}
}
