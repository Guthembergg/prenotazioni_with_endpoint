package com.GestionePrenotazioni.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
//@RestController
@RequestMapping("homepage")
public class LanguageController {

	@GetMapping
	public String getHomePage() {
		System.out.println("getHomePage");
	
		return "homepage";
	}

	@GetMapping("/{test}")
	public String getHomePagePathParam(@PathVariable String test){
		// http://localhost:8080/homepage/param/ciao
		if (test.equals("english")) {
			return "The reservation is valid for one day only and can be made only if the station is free for that day. A user can search for stations by indicating the type of station desired and the city of interest. A user can have multiple reservations in progress, but cannot reserve more than one seat for a particular date. ";

		} else if (test.equals("italiano")) {
			return "La prenotazione vale per un solo giorno e può essere effettuata solo se per quel giorno la postazione risulta libera. Un utente può ricercare le postazioni indicando il tipo di postazione desiderato e la città di interesse. Un utente può avere più prenotazioni in corso, ma non può prenotare più di una postazione per una particolare data.";
		} else {
			//throw new Exception();
			return "errorPage";
		}

	}
//
//	@GetMapping("/english")
//	public @ResponseBody String getHomePageQueryString() {
//		// http://localhost:8080/homepage/param?test=ciao
//		return "The reservation is valid for one day only and can be made only if the station is free for that day. A user can search for stations by indicating the type of station desired and the city of interest. A user can have multiple reservations in progress, but cannot reserve more than one seat for a particular date. ";
//	}
//
//	@GetMapping("/italiano")
//	public @ResponseBody String getHomePageQueryStringita() {
//		// http://localhost:8080/homepage/param?test=ciao
//		return "La prenotazione vale per un solo giorno e può essere effettuata solo se per quel giorno la postazione risulta libera. Un utente può ricercare le postazioni indicando il tipo di postazione desiderato e la città di interesse. Un utente può avere più prenotazioni in corso, ma non può prenotare più di una postazione per una particolare data.";
//	}

}
