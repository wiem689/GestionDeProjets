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

import tn.gestion.projets.spring.entity.Email;
import tn.gestion.projets.spring.service.EmailService;







@RestController
public class EmailController {
	
	@Autowired
	EmailService  cs ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Email
			@PostMapping("add-Email")
			@ResponseBody
			public Email addEmail (@RequestBody Email t) {
				Email email = cs.addEmail(t);         
			return email;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Email/{Email-id}
			@DeleteMapping("/remove-Email/{Email-id}")
			@ResponseBody
			public void removeEmail(@PathVariable("Email-id") long EmailId) {
				cs.deleteEmail(EmailId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Email
			@PutMapping("/modify-Email")
			@ResponseBody
			public Email modifyEmail(@RequestBody Email email) {
			return cs.updateEmail(email);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Email
			@GetMapping("/retrieve-all-Email")
			@ResponseBody
			public List<Email> getEmail() {
			List<Email> list = cs.retrieveAllEmail();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Email/{Email-id}
			@GetMapping("/retrieve-Email/{Email-id}")
			@ResponseBody
			public Email retrieveEmail(@PathVariable("Email-id") Long id) {
			return cs.retrieveEmail(id);           
			}

}
