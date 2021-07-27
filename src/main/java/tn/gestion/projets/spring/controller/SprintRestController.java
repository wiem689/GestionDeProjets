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

import tn.gestion.projets.spring.entity.Sprint;
import tn.gestion.projets.spring.service.ISprintService;

@RestController
public class SprintRestController {
	
	@Autowired
	ISprintService ss;
	
	
	//*******************add*********************************************************
		// http://localhost:8082/GestionDeProjets/servlet/add-sprint
				@PostMapping("add-sprint")
				@ResponseBody
				public Sprint addTaches(@RequestBody Sprint s) {
					Sprint sprint = ss.addSprint(s);         
				return sprint;
				}
				
	//*****************delete*********************************************************
				
				
				// http://localhost:8082/GestionDeProjets/servlet/remove-sprint/{sprint-id}
				@DeleteMapping("/remove-sprint/{sprint-id}")
				@ResponseBody
				public void removeSprint(@PathVariable("sprint-id") long sprintId) {
					ss.deleteSprint(sprintId);         
				}
				
				
	//********************************update*****************************************
				
				// http://localhost:8082/GestionDeProjets/servlet/modify-sprint
				@PutMapping("/modify-sprint")
				@ResponseBody
				public Sprint modifyTaches(@RequestBody Sprint sprint) {
				return ss.updateSprint(sprint);         
				}
				
				
	//***************************************retrieveAll***********************************
				
				// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-sprint
				@GetMapping("/retrieve-all-sprint")
				@ResponseBody
				public List<Sprint> getSprint() {
				List<Sprint> list = ss.retrieveAllSprint();             
				return list;
				}
				
	//***********************************************retrievebyid**************************************				
				
				
				//http://localhost:8082/GestionDeProjets/servlet/retrieve-sprint/{sprint-id}
				@GetMapping("/retrieve-sprint/{sprint-id}")
				@ResponseBody
				public Sprint retrieveSprint(@PathVariable("sprint-id") Long id) {
				return ss.retrieveSprint(id);           
				}


}
