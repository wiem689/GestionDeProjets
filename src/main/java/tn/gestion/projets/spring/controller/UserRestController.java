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

import tn.gestion.projets.spring.entity.User;
import tn.gestion.projets.spring.service.IUserService;

@RestController
public class UserRestController {
	
	@Autowired
	IUserService userService ;
	
	
	//*******************add*********************************************************
			// http://localhost:8082/GestionDeProjets/servlet/add-User
					@PostMapping("add-User")
					@ResponseBody
					public User addUser(@RequestBody User u) {
						User user = userService.addUser(u);         
					return user;
					}
					
		//*****************delete*********************************************************
					
					
					// http://localhost:8082/GestionDeProjets/servlet/remove-user/{user-id}
					@DeleteMapping("/remove-user/{user-id}")
					@ResponseBody
					public void removeUser(@PathVariable("user-id") long userId) {
						userService.deleteUser(userId);         
					}
					
					
	    //********************************update*****************************************
					
					// http://localhost:8082/GestionDeProjets/servlet/modify-user
					@PutMapping("/modify-user")
					@ResponseBody
					public User modifyOrders(@RequestBody User user) {
					return userService.updateUser(user);         
					}
					
					
	//***************************************retrieveAll***********************************
					
					// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-user
					@GetMapping("/retrieve-all-user")
					@ResponseBody
					public List<User> getUser() {
					List<User> list = userService.retrieveAllUser();             
					return list;
					}
					
	//***********************************************retrievebyid**************************************				
					
					
					//http://localhost:8082/GestionDeProjets/servlet/retrieve-user/{user-id}
					@GetMapping("/retrieve-user/{user-id}")
					@ResponseBody
					public User retrieveUser(@PathVariable("user-id") Long id) {
					return userService.retrieveUser(id);           
					}

	}



