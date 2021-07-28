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

import tn.gestion.projets.spring.entity.Commentaire;
import tn.gestion.projets.spring.service.CommentaireService;








@RestController
public class CommentaireController {
	
	@Autowired
	CommentaireService  cs ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Commentaire
			@PostMapping("add-Commentaire")
			@ResponseBody
			public Commentaire addTraitement (@RequestBody Commentaire t) {
				Commentaire commentaire = cs.addCommentaire(t);         
			return commentaire;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Commentaire/{Commentaire-id}
			@DeleteMapping("/remove-Commentaire/{Commentaire-id}")
			@ResponseBody
			public void removeCommentaire(@PathVariable("Commentaire-id") long CommentaireId) {
				cs.deleteCommentaire(CommentaireId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Commentaire
			@PutMapping("/modify-Commentaire")
			@ResponseBody
			public Commentaire modifyCommentaire(@RequestBody Commentaire commentaire) {
			return cs.updateCommentaire(commentaire);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Commentaire
			@GetMapping("/retrieve-all-Commentaire")
			@ResponseBody
			public List<Commentaire> getCommentaire() {
			List<Commentaire> list = cs.retrieveAllCommentaire();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Commentaire/{Commentaire-id}
			@GetMapping("/retrieve-Claim/{Commentaire-id}")
			@ResponseBody
			public Commentaire retrieveCommentaire(@PathVariable("Commentaire-id") Long id) {
			return cs.retrieveCommentaire(id);           
			}

}