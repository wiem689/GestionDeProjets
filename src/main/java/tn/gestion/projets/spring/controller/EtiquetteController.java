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

import tn.gestion.projets.spring.entity.Etiquette;
import tn.gestion.projets.spring.service.EtiquetteService;










@RestController
public class EtiquetteController {
	
	@Autowired
	EtiquetteService  es ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Etiquette
			@PostMapping("add-Etiquette")
			@ResponseBody
			public Etiquette addEquipe (@RequestBody Etiquette t) {
				Etiquette etiquette = es.addEtiquette(t);         
			return etiquette;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Etiquette/{Etiquette-id}
			@DeleteMapping("/remove-Etiquette/{Etiquette-id}")
			@ResponseBody
			public void removeEtiquette(@PathVariable("Etiquette-id") long EtiquetteId) {
				es.deleteEtiquette(EtiquetteId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Etiquette
			@PutMapping("/modify-Etiquette")
			@ResponseBody
			public Etiquette modifyEtiquette(@RequestBody Etiquette etiquette) {
			return es.updateEtiquette(etiquette);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Etiquette
			@GetMapping("/retrieve-all-Etiquette")
			@ResponseBody
			public List<Etiquette> getEtiquette() {
			List<Etiquette> list = es.retrieveAllEtiquette();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Etiquette/{Etiquette-id}
			@GetMapping("/retrieve-Etiquette/{Etiquette-id}")
			@ResponseBody
			public Etiquette retrieveEtiquette(@PathVariable("Etiquette-id") Long id) {
			return es.retrieveEtiquette(id);           
			}

}