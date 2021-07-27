package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Payment;

public interface IPaymentService {

	Payment addPayment(Payment a);
	boolean deletePayment(long id);
	Payment updatePayment( Payment a);
	List<Payment> retrieveAllPayment();
	Payment retrievePayment(Long id);
}
