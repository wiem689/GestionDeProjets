package tn.gestion.projets.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jeux implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String type ;
	
	
	@ManyToOne
	User User;


	public Jeux() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public User getUser() {
		return User;
	}


	public void setUser(User user) {
		User = user;
	}


	public Jeux(Long id, String type, tn.gestion.projets.spring.entity.User user) {
		super();
		this.id = id;
		this.type = type;
		User = user;
	}


	public Jeux(String type, tn.gestion.projets.spring.entity.User user) {
		super();
		this.type = type;
		User = user;
	}
	
	

}
