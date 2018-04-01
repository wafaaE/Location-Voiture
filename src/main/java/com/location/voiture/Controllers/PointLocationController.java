package com.location.voiture.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.location.voiture.DAO.PointLocationRepository;
import com.location.voiture.Entities.PointLocation;

@Controller
@RequestMapping(value="/points")
public class PointLocationController {
	@Autowired
	private PointLocationRepository repository;
	
	@RequestMapping(value="/index")
	public String Index(Model model) {
		List<PointLocation> points = repository.findAll();
		model.addAttribute("points", points);
		return "points";
	}
}
