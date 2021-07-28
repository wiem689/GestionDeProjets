//package tn.gestion.projets.spring.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//
//import tn.gestion.projets.spring.entity.Favorirecherche;
//import tn.gestion.projets.spring.service.FavorirechercheService;
//
//
//
//
//
//
//
//
//
//
//@RestController
//public class FavorirechercheController {
//	
//	@Autowired
//	Favorirecherche  fs ;
//	
//	//*******************add*********************************************************
//	// http://localhost:8082/GestionDeProjets/servlet/add-Favorirecherche
////			@PostMapping("add-Favorirecherche")
////			@ResponseBody
////			public Favorirecherche addFavorirecherche (@RequestBody Favorirecherche t) {
////				Favorirecherche favorirecherche = fs.addFavorirecherche(t);         
////			return favorirecherche;
////			}
////			
//////*****************delete*********************************************************
////			
////			
//			// http://localhost:8082/GestionDeProjets/servlet/remove-Favorirecherche/{Favorirecherche-id}
//			@DeleteMapping("/remove-Favorirecherche/{Favorirecherche-id}")
//			@ResponseBody
//			public void removeFavorirecherche(@PathVariable("Favorirecherche-id") long FavorirechercheId) {
//				fs.deleteFavorirecherche(FavorirechercheId);         
//			}
//			
//			
////********************************update*****************************************
//			
//			// http://localhost:8082/GestionDeProjets/servlet/modify-Favorirecherche
//			@PutMapping("/modify-Favorirecherche")
//			@ResponseBody
//			public Favorirecherche modifyFavorirecherche(@RequestBody Favorirecherche favorirecherche) {
//			return fs.updateFavorirecherche(favorirecherche);         
//			}
//			
//			
////***************************************retrieveAll***********************************
//			
//			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-Favorirecherche
//			@GetMapping("/retrieve-all-Favorirecherche")
//			@ResponseBody
//			public List<Favorirecherche> getFavorirecherche() {
//			List<Favorirecherche> list = fs.retrieveAllFavorirecherche();             
//			return list;
//			}
//			
////***********************************************retrievebyid**************************************				
//			
//			
//			//http://localhost:8082/GestionDeProjets/servlet/retrieve-Favorirecherche/{Favorirecherche-id}
//			@GetMapping("/retrieve-Favorirecherche/Favorirecherche-id}")
//			@ResponseBody
//			public Favorirecherche retrieveFavorirecherche(@PathVariable("Favorirecherche-id") Long id) {
//			return fs.retrieveFavorirecherche(id);           
//			}
//
//}
