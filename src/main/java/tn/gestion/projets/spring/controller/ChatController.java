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

import tn.gestion.projets.spring.entity.Chat;
import tn.gestion.projets.spring.service.ChatService;




@RestController
public class ChatController {
	
	@Autowired
	ChatService  cs ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Chat
			@PostMapping("add-Chat")
			@ResponseBody
			public Chat addChat (@RequestBody Chat t) {
				Chat chat = cs.addChat(t);         
			return chat;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Chat/{Chat-id}
			@DeleteMapping("/remove-Chat/{Chat-id}")
			@ResponseBody
			public void removeChat(@PathVariable("Chat-id") long ChatId) {
				cs.deleteChat(ChatId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Chat
			@PutMapping("/modify-Chat")
			@ResponseBody
			public Chat modifyChat(@RequestBody Chat chat) {
			return cs.updateChat(chat);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Chat
			@GetMapping("/retrieve-all-Chat")
			@ResponseBody
			public List<Chat> getChat() {
			List<Chat> list = cs.retrieveAllChat();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Chat/{Chat-id}
			@GetMapping("/retrieve-Chat/{Chat-id}")
			@ResponseBody
			public Chat retrieveChat(@PathVariable("Chat-id") Long id) {
			return cs.retrieveChat(id);           
			}

}

