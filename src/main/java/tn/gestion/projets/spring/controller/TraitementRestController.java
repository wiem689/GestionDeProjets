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

import tn.gestion.projets.spring.entity.Traitement;
import tn.gestion.projets.spring.service.ITraitementService;

@RestController
public class TraitementRestController {
	
	@Autowired
	ITraitementService  ts ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Traitement
			@PostMapping("add-Traitement")
			@ResponseBody
			public Traitement addTraitement (@RequestBody Traitement t) {
				Traitement traitement = ts.addTraitement(t);         
			return traitement;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-traitement/{traitement-id}
			@DeleteMapping("/remove-traitement/{traitement-id}")
			@ResponseBody
			public void removeTraitement(@PathVariable("traitement-id") long traitementId) {
				ts.deleteTraitement(traitementId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-traitement
			@PutMapping("/modify-traitement")
			@ResponseBody
			public Traitement modifyTraitement(@RequestBody Traitement traitement) {
			return ts.updateTraitement(traitement);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-traitement
			@GetMapping("/retrieve-all-traitement")
			@ResponseBody
			public List<Traitement> getTraitement() {
			List<Traitement> list = ts.retrieveAllTraitement();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-traitement/{traitement-id}
			@GetMapping("/retrieve-traitement/{traitement-id}")
			@ResponseBody
			public Traitement retrieveTraitement(@PathVariable("traitement-id") Long id) {
			return ts.retrieveTraitement(id);           
			}

}






