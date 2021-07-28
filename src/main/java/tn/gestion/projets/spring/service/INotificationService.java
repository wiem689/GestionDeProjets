package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Notification;

public interface INotificationService {
	
	Notification addNotification(Notification n);
	boolean deleteNotification(long id);
	Notification updateNotification( Notification n);
	List<Notification> retrieveAllNotification();
	Notification retrieveNotification(Long id);

}
