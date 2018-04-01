package com.location.voiture.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.location.voiture.DAO.ParametreRepository;
import com.location.voiture.Entities.Parametre;

@Controller
@RequestMapping(value="/parametres")
public class ParametreController {
	@Autowired
	private ParametreRepository repository;
	
	@RequestMapping(value="/index")
	public String Index(Model model) {
		List<Parametre> parametres = repository.findAll();
		model.addAttribute("parametres", parametres);
		return "parametres";
	}
	@RequestMapping(value="/UpdateParametre",method=RequestMethod.POST)
	public String update(Parametre p) {
		repository.save(p);
		return "redirect:index";
	}
	@RequestMapping(value="/edit")
	public String edit(Long id,Model model) {
		Parametre p = repository.getOne(id);
		model.addAttribute("parametre", p);
		return "formParametres";
	}
}
