package com.location.voiture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.location.voiture.DAO.VoitureRepository;
import com.location.voiture.Entities.Voiture;

@SpringBootApplication
public class LocationVoitureApplication {

	public static void main(String[] args)  {
		ApplicationContext ctx=	SpringApplication.run(LocationVoitureApplication.class, args);
		VoitureRepository voitureRepository=ctx.getBean(VoitureRepository.class);
		//DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		//df.parse("2012-06-12");
		voitureRepository.save(new Voiture("EF-456-AD", "Renault", "Aucun", 1300, 120, 200));
		}
}
