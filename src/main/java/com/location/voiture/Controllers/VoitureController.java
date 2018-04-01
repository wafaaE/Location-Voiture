package com.location.voiture.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.location.voiture.DAO.VoitureRepository;
import com.location.voiture.Entities.Voiture;

@Controller
@RequestMapping(value="/voitures")
public class VoitureController {
	@Autowired
	private VoitureRepository voitureRepository;
	
	@RequestMapping(value="/index")
	public String Index(Model model) {		
		List<Voiture> voitures = voitureRepository.disponibiliteVoiture();
		
		model.addAttribute("voiture", voitures);
		return"VisualisationVoitures";
	}
	
	@RequestMapping(value="/rent")
	public String rent(Long id, Model model) {
		Voiture v = voitureRepository.getOne(id);
		model.addAttribute("voiture", v);
		return "redirect:/reservations/new?idVoiture="+id;
	}
}
