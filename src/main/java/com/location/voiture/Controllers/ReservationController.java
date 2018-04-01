	package com.location.voiture.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.location.voiture.DAO.ReservationRepository;
import com.location.voiture.Entities.Reservation;
import com.location.voiture.Entities.Utilisateur;

@Controller
@RequestMapping(value="/reservations")
public class ReservationController {
	
	@Autowired
	private ReservationRepository repository;
	
	@RequestMapping(value="/index")
	public String Index(Model model) {
		Utilisateur user = (Utilisateur) SecurityContextHolder.getContext()
		        .getAuthentication().getPrincipal();
		
		List<Reservation> reservations = repository.findByUtilisateur(user.getEmail());
		
		model.addAttribute("reservations", reservations);
		return "reservations";
	}
	
	@RequestMapping(value="/new",method=RequestMethod.GET)
	public String formReservations() {
		return "newReservation";
	}

}
