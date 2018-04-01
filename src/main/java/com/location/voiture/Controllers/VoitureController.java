package com.location.voiture.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.location.voiture.DAO.VoitureRepository;
import com.location.voiture.Entities.Voiture;

public class VoitureController {
	@Autowired
	private VoitureRepository voitureRepository;
	
	@RequestMapping(value="/Index")
	public String Index(Model model) {		
		List<Voiture> voitures = voitureRepository.disponibiliteVoiture();
		
		model.addAttribute("voiture", voitures);
		return"VisualisationVoitures";
	}
}
