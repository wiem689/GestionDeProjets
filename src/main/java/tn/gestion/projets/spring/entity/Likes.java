package tn.gestion.projets.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Likes implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String emoji ;
	
	
	


	public Likes() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getEmoji() {
		return emoji;
	}


	public void setEmoji(String emoji) {
		this.emoji = emoji;
	}


	public User getUser() {
		return User;
	}


	public void setUser(User user) {
		User = user;
	}


	public Taches getTaches() {
		return Taches;
	}


	public void setTaches(Taches taches) {
		Taches = taches;
	}


	public Likes(Long id, String emoji, tn.gestion.projets.spring.entity.User user,
			tn.gestion.projets.spring.entity.Taches taches) {
		super();
		this.id = id;
		this.emoji = emoji;
		User = user;
		Taches = taches;
	}


	public Likes(String emoji, tn.gestion.projets.spring.entity.User user,
			tn.gestion.projets.spring.entity.Taches taches) {
		super();
		this.emoji = emoji;
		User = user;
		Taches = taches;
	}
	
	
	@ManyToOne
	User User;
	
	
	@ManyToOne
	Taches Taches;
	
	

}
