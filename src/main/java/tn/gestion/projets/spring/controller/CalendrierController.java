package tn.gestion.projets.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.gestion.projets.spring.entity.Calendrier;
import tn.gestion.projets.spring.service.CalendrierService;


@RestController
public class CalendrierController {
	
	@Autowired
	CalendrierService  cs ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Calendrier
			@PostMapping("add-Calendrier")
			@ResponseBody
			public Calendrier addTraitement (@RequestBody Calendrier t) {
				Calendrier calendrier = cs.addCalendrier(t);         
			return calendrier;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Calendrier/{Calendrier-id}
			@DeleteMapping("/remove-Calendrier/{Calendrier-id}")
			@ResponseBody
			public void removeCalendrier(@PathVariable("Calendrier-id") long CalendrierId) {
				cs.deleteCalendrier(CalendrierId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Calendrier
			@PutMapping("/modify-Calendrier")
			@ResponseBody
			public Calendrier modifyCalendrier(@RequestBody Calendrier calendrier) {
			return cs.updateCalendrier(calendrier);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Calendrier
			@GetMapping("/retrieve-all-Calendrier")
			@ResponseBody
			public List<Calendrier> getCalendrier() {
			List<Calendrier> list = cs.retrieveAllCalendrier();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Calendrier/{Calendrier-id}
			@GetMapping("/retrieve-Calendrier/{Calendrier-id}")
			@ResponseBody
			public Calendrier retrieveCalendrier(@PathVariable("Calendrier-id") Long id) {
			return cs.retrieveCalendrier(id);           
			}

}






