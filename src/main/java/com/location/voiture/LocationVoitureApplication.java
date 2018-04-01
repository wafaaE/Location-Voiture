package com.location.voiture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.location.voiture.DAO.VoitureRepository;
import com.location.voiture.Entities.Voiture;

@SpringBootApplication
public class LocationVoitureApplication {

	public static void main(String[] args)  {
		SpringApplication.run(LocationVoitureApplication.class, args);
	}
}
