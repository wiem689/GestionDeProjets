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

import tn.gestion.projets.spring.entity.Payment;
import tn.gestion.projets.spring.entity.Projet;
import tn.gestion.projets.spring.service.IPaymentService;

@RestController
public class PaymentRestController {
	
	@Autowired
	IPaymentService ys ; 
	
	//*******************add*********************************************************
	// http://localhost:8082/GestionDeProjets/servlet/add-payment
			@PostMapping("add-payment")
			@ResponseBody
			public Payment addPayment(@RequestBody Payment p) {
				Payment payment = ys.addPayment(p);         
			return payment;
			}
			
//*****************delete*********************************************************
			
			
			// http://localhost:8082/GestionDeProjets/servlet/remove-payment/{payment-id}
			@DeleteMapping("/remove-payment/{payment-id}")
			@ResponseBody
			public void removepayment(@PathVariable("Payment-id") long paymentId) {
				ys.deletePayment(paymentId);         
			}
			
			
//********************************update*****************************************
			
			// http://localhost:8082/GestionDeProjets/servlet/modify-payment
			@PutMapping("/modify-payment")
			@ResponseBody
			public Payment modifyPayment(@RequestBody Payment payment) {
			return ys.updatePayment(payment);         
			}
			
			
//***************************************retrieveAll***********************************
			
			// http://localhost:8082/GestionDeProjets/servlet/retrieve-all-payment
			@GetMapping("/retrieve-all-payment")
			@ResponseBody
			public List<Payment> getPayment() {
			List<Payment> list = ys.retrieveAllPayment();             
			return list;
			}
			
//***********************************************retrievebyid**************************************				
			
			
			//http://localhost:8082/GestionDeProjets/servlet/retrieve-payment/{payment-id}
			@GetMapping("/retrieve-payment/{payment-id}")
			@ResponseBody
			public Payment retrievePayment(@PathVariable("payment-id") Long id) {
			return ys.retrievePayment(id);           
			}


}
