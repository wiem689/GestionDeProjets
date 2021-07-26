package tn.gestion.projets.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom ;
	private String prenom ;
	private String email ;
	private String mp ;
	private String tel ;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Jeux> Jeux;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Favorirecherche> Favorirecherche;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Notification> Notification;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Conversation> Conversation;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<LikeComments> LikeComments;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Likes> Likes;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Projet> Projet;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Equipe> Equipe;


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMp() {
		return mp;
	}


	public void setMp(String mp) {
		this.mp = mp;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public Set<Jeux> getJeux() {
		return Jeux;
	}


	public void setJeux(Set<Jeux> jeux) {
		Jeux = jeux;
	}


	public Set<Favorirecherche> getFavorirecherche() {
		return Favorirecherche;
	}


	public void setFavorirecherche(Set<Favorirecherche> favorirecherche) {
		Favorirecherche = favorirecherche;
	}


	public Set<Notification> getNotification() {
		return Notification;
	}


	public void setNotification(Set<Notification> notification) {
		Notification = notification;
	}


	public Set<Conversation> getConversation() {
		return Conversation;
	}


	public void setConversation(Set<Conversation> conversation) {
		Conversation = conversation;
	}


	public Set<LikeComments> getLikeComments() {
		return LikeComments;
	}


	public void setLikeComments(Set<LikeComments> likeComments) {
		LikeComments = likeComments;
	}


	public Set<Likes> getLike() {
		return Likes;
	}


	public void setLike(Set<Likes> like) {
		Likes = like;
	}


	public Set<Projet> getProjet() {
		return Projet;
	}


	public void setProjet(Set<Projet> projet) {
		Projet = projet;
	}


	public Set<Equipe> getEquipe() {
		return Equipe;
	}


	public void setEquipe(Set<Equipe> equipe) {
		Equipe = equipe;
	}


	public User(Long id, String nom, String prenom, String email, String mp, String tel,
			Set<tn.gestion.projets.spring.entity.Jeux> jeux,
			Set<tn.gestion.projets.spring.entity.Favorirecherche> favorirecherche,
			Set<tn.gestion.projets.spring.entity.Notification> notification,
			Set<tn.gestion.projets.spring.entity.Conversation> conversation,
			Set<tn.gestion.projets.spring.entity.LikeComments> likeComments,
			Set<tn.gestion.projets.spring.entity.Likes> like, Set<tn.gestion.projets.spring.entity.Projet> projet,
			Set<tn.gestion.projets.spring.entity.Equipe> equipe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mp = mp;
		this.tel = tel;
		Jeux = jeux;
		Favorirecherche = favorirecherche;
		Notification = notification;
		Conversation = conversation;
		LikeComments = likeComments;
		Likes = like;
		Projet = projet;
		Equipe = equipe;
	}


	public User(String nom, String prenom, String email, String mp, String tel,
			Set<tn.gestion.projets.spring.entity.Jeux> jeux,
			Set<tn.gestion.projets.spring.entity.Favorirecherche> favorirecherche,
			Set<tn.gestion.projets.spring.entity.Notification> notification,
			Set<tn.gestion.projets.spring.entity.Conversation> conversation,
			Set<tn.gestion.projets.spring.entity.LikeComments> likeComments,
			Set<tn.gestion.projets.spring.entity.Likes> like, Set<tn.gestion.projets.spring.entity.Projet> projet,
			Set<tn.gestion.projets.spring.entity.Equipe> equipe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mp = mp;
		this.tel = tel;
		Jeux = jeux;
		Favorirecherche = favorirecherche;
		Notification = notification;
		Conversation = conversation;
		LikeComments = likeComments;
		Likes = like;
		Projet = projet;
		Equipe = equipe;
	}

	
	
	

	
	
	

}
