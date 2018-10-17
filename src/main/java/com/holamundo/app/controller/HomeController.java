package com.holamundo.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome()
	{
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model model)
	{
		List<String> peliculas = new ArrayList<String>();
		
		peliculas.add("Rapido y Furioso");
		peliculas.add("El aro");
		peliculas.add("Alien");
		
		model.addAttribute("peliculas", peliculas);
		
		
		
		return "home";
	}

	@RequestMapping(value="/detail")
	public String mostrarDetalle(Model model)
	{
		String tituloPelicula = "Robocop";
		int duracion = 136;
		double precioEntrada = 50;
		
		model.addAttribute("titulo", tituloPelicula);
		model.addAttribute("duracion", duracion);
		model.addAttribute("precio", precioEntrada);
		
		return "detalle";
	}
}
