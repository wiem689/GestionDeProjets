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

import tn.gestion.projets.spring.entity.Fin;
import tn.gestion.projets.spring.service.FinService;










@RestController
public class FinController {
	
	@Autowired
	FinService  fs ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Fin
			@PostMapping("add-Fin")
			@ResponseBody
			public Fin addEquipe (@RequestBody Fin t) {
				Fin Fin = fs.addFin(t);         
			return Fin;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Fin/{Fin-id}
			@DeleteMapping("/remove-Fin/{Fin-id}")
			@ResponseBody
			public void removeFin(@PathVariable("Fin-id") long FinId) {
				fs.deleteFin(FinId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Fin
			@PutMapping("/modify-Fin")
			@ResponseBody
			public Fin modifyFin(@RequestBody Fin fin) {
			return fs.updateFin(fin);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Fin
			@GetMapping("/retrieve-all-Fin")
			@ResponseBody
			public List<Fin> getFin() {
			List<Fin> list = fs.retrieveAllFin();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Fin/{Fin-id}
			@GetMapping("/retrieve-Fin/{Fin-id}")
			@ResponseBody
			public Fin retrieveFin(@PathVariable("Fin-id") Long id) {
			return fs.retrieveFin(id);           
			}

}
