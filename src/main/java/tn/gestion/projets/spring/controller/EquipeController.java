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

import tn.gestion.projets.spring.entity.Equipe;
import tn.gestion.projets.spring.service.EquipeService;









@RestController
public class EquipeController {
	
	@Autowired
	EquipeService  es ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Equipe
			@PostMapping("add-Equipe")
			@ResponseBody
			public Equipe addEquipe (@RequestBody Equipe t) {
				Equipe equipe = es.addEquipe(t);         
			return equipe;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Equipe/{Equipe-id}
			@DeleteMapping("/remove-Equipe/{Equipe-id}")
			@ResponseBody
			public void removeEquipe(@PathVariable("Equipe-id") long EquipeId) {
				es.deleteEquipe(EquipeId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Equipe
			@PutMapping("/modify-Equipe")
			@ResponseBody
			public Equipe modifyEquipe(@RequestBody Equipe equipe) {
			return es.updateEquipe(equipe);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Equipe
			@GetMapping("/retrieve-all-Equipe")
			@ResponseBody
			public List<Equipe> getEquipe() {
			List<Equipe> list = es.retrieveAllEquipe();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Equipe/{Equipe-id}
			@GetMapping("/retrieve-Equipe/{Equipe-id}")
			@ResponseBody
			public Equipe retrieveEquipe(@PathVariable("Equipe-id") Long id) {
			return es.retrieveEquipe(id);           
			}

}