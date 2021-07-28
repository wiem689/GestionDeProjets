package tn.gestion.projets.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Notification implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	
	
	@ManyToOne
	User User;



	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public User getUser() {
		return User;
	}



	public void setUser(User user) {
		User = user;
	}



	public Notification(Long id, tn.gestion.projets.spring.entity.User user) {
		super();
		this.id = id;
		User = user;
	}



	public Notification(tn.gestion.projets.spring.entity.User user) {
		super();
		User = user;
	}



	public Notification(Long id, Date date, tn.gestion.projets.spring.entity.User user) {
		super();
		this.id = id;
		this.date = date;
		User = user;
	}



	public Notification(Date date, tn.gestion.projets.spring.entity.User user) {
		super();
		this.date = date;
		User = user;
	}
	
	
	
	

}
