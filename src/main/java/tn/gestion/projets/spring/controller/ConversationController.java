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

import tn.gestion.projets.spring.entity.Conversation;
import tn.gestion.projets.spring.service.ConversationService;



@RestController
public class ConversationController {
	
	@Autowired
	ConversationService  cs ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Conversation
			@PostMapping("add-Conversation")
			@ResponseBody
			public Conversation addConversation (@RequestBody Conversation t) {
				Conversation conversation = cs.addConversation(t);         
			return conversation;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Conversation/{Conversation-id}
			@DeleteMapping("/remove-Conversation/{Conversation-id}")
			@ResponseBody
			public void removeConversation(@PathVariable("Conversation-id") long ConversationId) {
				cs.deleteConversation(ConversationId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Conversation
			@PutMapping("/modify-Conversation")
			@ResponseBody
			public Conversation modifyConversation(@RequestBody Conversation conversation) {
			return cs.updateConversation(conversation);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Conversation
			@GetMapping("/retrieve-all-Conversation")
			@ResponseBody
			public List<Conversation> getConversation() {
			List<Conversation> list = cs.retrieveAllConversation();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Conversation/{Conversation-id}
			@GetMapping("/retrieve-Claim/{Conversation-id}")
			@ResponseBody
			public Conversation retrieveConversation(@PathVariable("Conversation-id") Long id) {
			return cs.retrieveConversation(id);           
			}

}
