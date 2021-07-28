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

import tn.gestion.projets.spring.entity.Notification;
import tn.gestion.projets.spring.service.INotificationService;

@RestController
public class NotificationRestController {
	
	@Autowired
	INotificationService ns ;
	
	//*******************add*********************************************************
		// http://localhost:8082/GestionDeProjets/servlet/add-notification
				@PostMapping("add-notification")
				@ResponseBody
				public Notification addNotification(@RequestBody Notification n) {
					Notification notification = ns.addNotification(n);         
				return notification;
				}
				
	//*****************delete*********************************************************
				
				
				// http://localhost:8082/GestionDeProjets/servlet/remove-notification/{notification-id}
				@DeleteMapping("/remove-notification/{notification-id}")
				@ResponseBody
				public void removenotification(@PathVariable("notification-id") long notificationId) {
					ns.deleteNotification(notificationId);         
				}
				
				
	//********************************update*****************************************
				
				// http://localhost:8082/GestionDeProjets/servlet/modify-notification
				@PutMapping("/modify-notification")
				@ResponseBody
				public Notification modifyNotification(@RequestBody Notification notification) {
				return ns.updateNotification(notification);         
				}
				
				
	//***************************************retrieveAll***********************************
				
				// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-notification
				@GetMapping("/retrieve-all-notification")
				@ResponseBody
				public List<Notification> getNotification() {
				List<Notification> list = ns.retrieveAllNotification();             
				return list;
				}
				
	//***********************************************retrievebyid**************************************				
				
				
				//http://localhost:8082/GestionDeProjets/servlet/retrieve-notification/{notification-id}
				@GetMapping("/retrieve-notification/{notification-id}")
				@ResponseBody
				public Notification retrieveNotification(@PathVariable("notification-id") Long id) {
				return ns.retrieveNotification(id);           
				}


}
