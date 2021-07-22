package tn.gestion.projets.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LikeComments implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String emoji ;
	
	
	@ManyToOne
	User User;
	
	@ManyToOne
	Commentaire Commentaire;

	public LikeComments() {
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

	public Commentaire getCommentaire() {
		return Commentaire;
	}

	public void setCommentaire(Commentaire commentaire) {
		Commentaire = commentaire;
	}

	public LikeComments(Long id, String emoji, tn.gestion.projets.spring.entity.User user,
			tn.gestion.projets.spring.entity.Commentaire commentaire) {
		super();
		this.id = id;
		this.emoji = emoji;
		User = user;
		Commentaire = commentaire;
	}

	public LikeComments(String emoji, tn.gestion.projets.spring.entity.User user,
			tn.gestion.projets.spring.entity.Commentaire commentaire) {
		super();
		this.emoji = emoji;
		User = user;
		Commentaire = commentaire;
	}
	
	
	
	
	

}
