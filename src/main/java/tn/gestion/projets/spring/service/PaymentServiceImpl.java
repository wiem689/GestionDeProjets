package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Payment;
import tn.gestion.projets.spring.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements IPaymentService {
	
	@Autowired
	PaymentRepository paymentRepo ;
	
	private static final Logger l = LogManager.getLogger(PaymentServiceImpl.class);


	@Override
	public Payment addPayment(Payment a) {
		return paymentRepo.save(a);
	}

	@Override
	public boolean deletePayment(long id) {
		if(paymentRepo.existsById(id)){
			paymentRepo.deleteById(id);
			return true;
		}
		else{
		return false;
		}	}

	@Override
	public Payment updatePayment(Payment a) {
		return paymentRepo.save(a);

	}

	@Override
	public List<Payment> retrieveAllPayment() {
		List<Payment> Payment = (List<Payment>) paymentRepo.findAll();
		for(Payment payment : Payment){
			l.info("payment :" + payment);
		}
		return Payment;
	}

	@Override
	public Payment retrievePayment(Long id) {
		return paymentRepo.findById(id).get();

	}

}
