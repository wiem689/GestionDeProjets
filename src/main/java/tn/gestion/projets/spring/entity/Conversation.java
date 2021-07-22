package tn.gestion.projets.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Conversation implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String message;
	
	@ManyToOne
	User User;

	public Conversation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	public Conversation(Long id, String message, tn.gestion.projets.spring.entity.User user) {
		super();
		this.id = id;
		this.message = message;
		User = user;
	}

	public Conversation(String message, tn.gestion.projets.spring.entity.User user) {
		super();
		this.message = message;
		User = user;
	}
	
	
	


}
