	package com.location.voiture.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.location.voiture.DAO.ReservationRepository;
import com.location.voiture.DAO.UtilisateurRepository;
import com.location.voiture.DAO.VoitureRepository;
import com.location.voiture.Entities.Parametre;
import com.location.voiture.Entities.Reservation;
import com.location.voiture.Entities.Utilisateur;
import com.location.voiture.Entities.Voiture;

@Controller
@RequestMapping(value="/reservations")
public class ReservationController {
	@Autowired
	private UtilisateurRepository utilisateurs;
	
	@Autowired
	private ReservationRepository repository;
	
	@Autowired
	private VoitureRepository voitureRepository;
	
	@RequestMapping(value="/index")
	public String Index(Model model) {
		//Utilisateur user = (Utilisateur) SecurityContextHolder.getContext()
		  //      .getAuthentication().getPrincipal();

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String email = auth.getName();
		Utilisateur user = utilisateurs.getOne(email);
		
		List<Reservation> reservations = repository.findByUtilisateur(user);
		
		model.addAttribute("reservations", reservations);
		return "reservations";
	}
	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public String formReservations(Long idVoiture,Model model) {
		Voiture voiture = voitureRepository.getOne(idVoiture);
		Reservation reservation = new Reservation();
		reservation.setVoiture(voiture);
		model.addAttribute("reservation", reservation);	
		return "formReservation";
	}
	
	@RequestMapping(value="/newReservation",method=RequestMethod.POST)
	public String update(Reservation r) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String email = auth.getName();
		Utilisateur user = utilisateurs.getOne(email);
		r.setUtilisateur(user);
		repository.save(r);
		return "redirect:index";
	}

}
