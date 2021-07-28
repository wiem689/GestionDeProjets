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

import tn.gestion.projets.spring.entity.Creation;
import tn.gestion.projets.spring.service.CreationService;





@RestController
public class CreationController {
	
	@Autowired
	CreationService  cs ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Creation
			@PostMapping("add-Creation")
			@ResponseBody
			public Creation addCreation (@RequestBody Creation t) {
				Creation creation = cs.addCreation(t);         
			return creation;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Creation/{Creation-id}
			@DeleteMapping("/remove-Creation/{Creation-id}")
			@ResponseBody
			public void removeConversation(@PathVariable("Creation-id") long CreationId) {
				cs.deleteCreation(CreationId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Creation
			@PutMapping("/modify-Creation")
			@ResponseBody
			public Creation modifyCreation(@RequestBody Creation creation) {
			return cs.updateCreation(creation);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Creation
			@GetMapping("/retrieve-all-Creation")
			@ResponseBody
			public List<Creation> getCreation() {
			List<Creation> list = cs.retrieveAllCreation();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Creation/{Creation-id}
			@GetMapping("/retrieve-Creation/{Creation-id}")
			@ResponseBody
			public Creation retrieveCreation(@PathVariable("Creation-id") Long id) {
			return cs.retrieveCreation(id);           
			}

}
