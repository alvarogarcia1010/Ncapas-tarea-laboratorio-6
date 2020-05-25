package com.uca.capas.practico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.practico.domain.Contribuyente;
import com.uca.capas.practico.domain.Importancia;
import com.uca.capas.practico.service.ContribuyenteService;

@Controller
public class MainController 
{
	@Autowired
	private ContribuyenteService contribuyenteService;
	
	@RequestMapping("/")
	public ModelAndView initMain() 
	{
		ModelAndView mav = new ModelAndView();
		Contribuyente contribuyente = new Contribuyente();
		List<Importancia> listaDeImportancia = null;
		
		try {
			listaDeImportancia = contribuyenteService.getListaDeImportancias();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		mav.addObject("contribuyente", contribuyente);
		mav.addObject("importancias", listaDeImportancia);
		mav.setViewName("index");
		
		return mav;
	}
}
