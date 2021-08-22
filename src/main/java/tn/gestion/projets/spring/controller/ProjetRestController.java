package tn.gestion.projets.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.gestion.projets.spring.entity.Projet;
import tn.gestion.projets.spring.service.IProjetService;
import tn.gestion.projets.spring.service.ProjetServiceImpl;


@CrossOrigin(origins = "*")
@RestController
public class ProjetRestController {
	
	@Autowired
	IProjetService ps ;
	
	@Autowired
	ProjetServiceImpl projectService ;
	
	
	
	
	//*******************add*********************************************************
			// http://localhost:8082/GestionDeProjets/servlet/add-projet/{user-iid}
					@PostMapping("/add-projet/{user-iid}")
					@ResponseBody
					public String addProjet(@RequestBody Projet p ,@PathVariable("user-iid")String userId) {
						System.out.println("userId"+ userId);
						projectService.addProjet(p, userId) ;       
					return  "add successful ";
					}
					
					
					
		//*****************delete*********************************************************
					
					
					// http://localhost:8082/GestionDeProjets/servlet/remove-projet/{projet-id}/{user-id}
					@DeleteMapping("/remove-projet/{projet-id}/{user-id}")
					@ResponseBody
					public void removeProjet(@PathVariable("projet-id") long projetId , @PathVariable("user-id") long userId) {
						projectService.deleteProjet(projetId, userId);         
					}
					
					
					
					
					
					
		//********************************update*****************************************
					
					// http://localhost:8082/GestionDeProjets/servlet/modify-projet
					@PutMapping("/modify-projet")
					@ResponseBody
					public Projet modifyTaches(@RequestBody Projet projet) {
					return ps.updateProjet(projet);         
					}
					
					
		//***************************************retrieveAll***********************************
					
					// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-projet
					@GetMapping("/retrieve-all-projet")
					@ResponseBody
					public List<Projet> getProjet() {
					List<Projet> list = ps.retrieveAllProjet();             
					return list;
					}
					
		//***********************************************retrievebyid**************************************				
					
					
					//http://localhost:8082/GestionDeProjets/servlet/retrieve-projet/{projet-id}
					@GetMapping("/retrieve-projet/{projet-id}")
					@ResponseBody
					public Projet retrieveProjet(@PathVariable("projet-id") Long id) {
					return ps.retrieveProjet(id);           
					}


}
