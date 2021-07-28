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

import tn.gestion.projets.spring.entity.Likes;
import tn.gestion.projets.spring.service.ILikesService;

@RestController
public class LikesRestController {
	
	@Autowired
	ILikesService ls ;
	
	//*******************add*********************************************************
			// http://localhost:8082/GestionDeProjets/servlet/add-likes
					@PostMapping("add-likes")
					@ResponseBody
					public Likes addLikes(@RequestBody Likes l) {
						Likes likes = ls.addLikes(l);         
					return likes;
					}
					
		//*****************delete*********************************************************
					
					
					// http://localhost:8082/GestionDeProjets/servlet/remove-likes/{likes-id}
					@DeleteMapping("/remove-likes/{likes-id}")
					@ResponseBody
					public void removeLikes(@PathVariable("likes-id") long likesId) {
						ls.deleteLikes(likesId);         
					}
					
					
		//********************************update*****************************************
					
					// http://localhost:8082/GestionDeProjets/servlet/modify-likes
					@PutMapping("/modify-likes")
					@ResponseBody
					public Likes modifyLikes(@RequestBody Likes likes) {
					return ls.updateLikes(likes) ;         
					}
					
					
		//***************************************retrieveAll***********************************
					
					// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-likes
					@GetMapping("/retrieve-all-likes")
					@ResponseBody
					public List<Likes> getlikes() {
					List<Likes> list = ls.retrieveAllLikes();             
					return list;
					}
					
		//***********************************************retrievebyid**************************************				
					
					
					//http://localhost:8082/GestionDeProjets/servlet/retrieve-likes/{likes-id}
					@GetMapping("/retrieve-likes/{likes-id}")
					@ResponseBody
					public Likes retrieveLikes(@PathVariable("likes-id") Long id) {
					return ls.retrieveLikes(id);           
					}



}
