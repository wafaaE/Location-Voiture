package com.location.voiture.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.location.voiture.DAO.UtilisateurRepository;
import com.location.voiture.Entities.Utilisateur;

@Controller
public class LoginController {
	
	@Autowired
	private UtilisateurRepository repository;
	
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		Utilisateur user = new Utilisateur();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView createNewUser(@Valid Utilisateur user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		Utilisateur userExists = repository.findByEmail(user.getEmail());
		if (userExists != null) {
			bindingResult
					.rejectValue("email", "error.user",
							"Un utilisateur existe déjà avec le même e-mail.");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("registration");
		} else {
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			user.setEnabled(true);
			user.setProfil("c");
			repository.save(user);
			modelAndView.addObject("successMessage", "Inscription réussie.");
			modelAndView.addObject("user", new Utilisateur());
			modelAndView.setViewName("registration");
			
		}
		return modelAndView;
	}
}
