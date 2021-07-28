package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Notification;
import tn.gestion.projets.spring.entity.Payment;
import tn.gestion.projets.spring.repository.NotificationRepository;

@Service
public class NotificationServiceImpl implements INotificationService {
	
	@Autowired
	NotificationRepository nr ;
	
	private static final Logger l = LogManager.getLogger(NotificationServiceImpl.class);

	@Override
	public Notification addNotification(Notification n) {
		return nr.save(n);
	}

	@Override
	public boolean deleteNotification(long id) {
		if(nr.existsById(id)){
			nr.deleteById(id);
			return true;
		}
		else{
		return false;
		}	}

	@Override
	public Notification updateNotification(Notification n) {
		return nr.save(n);

	}

	@Override
	public List<Notification> retrieveAllNotification() {
		List<Notification> Notification = (List<Notification>) nr.findAll();
		for(Notification notification : Notification){
			l.info("notification :" + notification);
		}
		return Notification;	}

	@Override
	public Notification retrieveNotification(Long id) {
		return nr.findById(id).get();
	}


}
