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

import tn.gestion.projets.spring.entity.Taches;
import tn.gestion.projets.spring.entity.User;
import tn.gestion.projets.spring.service.ITachesService;

@RestController
public class TachesRestController {
	
	@Autowired
	ITachesService ts ; 
	
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-taches
			@PostMapping("add-taches")
			@ResponseBody
			public Taches addTaches(@RequestBody Taches t) {
				Taches taches = ts.addTaches(t);         
			return taches;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-taches/{taches-id}
			@DeleteMapping("/remove-taches/{taches-id}")
			@ResponseBody
			public void removeTaches(@PathVariable("taches-id") long tachesId) {
				ts.deleteTaches(tachesId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-taches
			@PutMapping("/modify-taches")
			@ResponseBody
			public Taches modifyTaches(@RequestBody Taches taches) {
			return ts.updateTaches(taches);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-taches
			@GetMapping("/retrieve-all-taches")
			@ResponseBody
			public List<Taches> getTaches() {
			List<Taches> list = ts.retrieveAllTaches();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-taches/{taches-id}
			@GetMapping("/retrieve-taches/{taches-id}")
			@ResponseBody
			public Taches retrieveTaches(@PathVariable("taches-id") Long id) {
			return ts.retrieveTaches(id);           
			}


}
