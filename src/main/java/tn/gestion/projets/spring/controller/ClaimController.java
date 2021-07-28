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

import tn.gestion.projets.spring.entity.Claim;
import tn.gestion.projets.spring.service.ClaimService;






@RestController
public class ClaimController {
	
	@Autowired
	ClaimService  cs ;
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-Claim
			@PostMapping("add-Claim")
			@ResponseBody
			public Claim addClaim (@RequestBody Claim t) {
				Claim claim = cs.addClaim(t);         
			return claim;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-Claim/{Claim-id}
			@DeleteMapping("/remove-Claim/{Claim-id}")
			@ResponseBody
			public void removeClaim(@PathVariable("Claim-id") long ClaimId) {
				cs.deleteClaim(ClaimId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-Claim
			@PutMapping("/modify-Claim")
			@ResponseBody
			public Claim modifyClaim(@RequestBody Claim claim) {
			return cs.updateClaim(claim);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Claim
			@GetMapping("/retrieve-all-Claim")
			@ResponseBody
			public List<Claim> getClaim() {
			List<Claim> list = cs.retrieveAllClaim();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Claim/{Claim-id}
			@GetMapping("/retrieve-Claim/{Claim-id}")
			@ResponseBody
			public Claim retrieveClaim(@PathVariable("Claim-id") Long id) {
			return cs.retrieveClaim(id);           
			}

}
