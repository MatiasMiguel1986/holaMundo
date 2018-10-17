package com.holamundo.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.holamundo.app.model.Pelicula;

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
		List<Pelicula> peliculas = getLista();
		
//		peliculas.add("Rapido y Furioso");
//		peliculas.add("El aro");
//		peliculas.add("Alien");
		
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
	
	private List<Pelicula> getLista()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista = null;
		
		try {
		
			lista = new ArrayList<Pelicula>();
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("Pelicula 1");
			pelicula1.setDuracion(120);
			pelicula1.setClasificacion("B");
			pelicula1.setGenero("Aventura");
			pelicula1.setFechaEstreno(formatter.parse("02-05-2017"));

			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(2);
			pelicula2.setTitulo("Pelicula 2");
			pelicula2.setDuracion(110);
			pelicula2.setClasificacion("A");
			pelicula2.setGenero("Infantil");
			pelicula2.setFechaEstreno(formatter.parse("02-10-2017"));
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(3);
			pelicula3.setTitulo("Pelicula 3");
			pelicula3.setDuracion(150);
			pelicula3.setClasificacion("C");
			pelicula3.setGenero("Aventura");
			pelicula3.setFechaEstreno(formatter.parse("06-08-2018"));
			
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			
			
		} catch (ParseException e) {
			System.out.println("Error:" + e.getMessage());
			
		}
		
		return lista;
	}
	
}
