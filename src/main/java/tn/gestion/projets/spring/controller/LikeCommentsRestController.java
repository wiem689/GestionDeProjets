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

import tn.gestion.projets.spring.entity.LikeComments;
import tn.gestion.projets.spring.service.ILikeCommentsService;

@RestController
public class LikeCommentsRestController {
	
	@Autowired
	ILikeCommentsService ls ;
	
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-likeComments
			@PostMapping("add-likeComments")
			@ResponseBody
			public LikeComments addLikeComments(@RequestBody LikeComments l) {
				LikeComments likeComments = ls.addLikeComments(l);         
			return likeComments;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-likeComments/{likeComments-id}
			@DeleteMapping("/remove-likeComments/{likeComments-id}")
			@ResponseBody
			public void removeLikeComments(@PathVariable("likeComments-id") long likeCommentsId) {
				ls.deleteLikeComments(likeCommentsId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-likeComments
			@PutMapping("/modify-likeComments")
			@ResponseBody
			public LikeComments modifyLikeComments(@RequestBody LikeComments likeComments) {
			return ls.updateLikeComments(likeComments) ;         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-likeComments
			@GetMapping("/retrieve-all-likeComments")
			@ResponseBody
			public List<LikeComments> getlikeComments() {
			List<LikeComments> list = ls.retrieveAllLikeComments();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-likeComments/{likeComments-id}
			@GetMapping("/retrieve-likeComments/{likeComments-id}")
			@ResponseBody
			public LikeComments retrieveLikeComments(@PathVariable("likeComments-id") Long id) {
			return ls.retrieveLikeComments(id);           
			}




}
