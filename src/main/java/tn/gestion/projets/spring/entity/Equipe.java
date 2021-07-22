package tn.gestion.projets.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Equipe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private int nbre ;
	
	
	
	@ManyToOne
	User User;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Equipe")
	private Set<Projet> Projet;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Equipe")
	private Set<Chat> Chat;

	public Equipe() {
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

	public int getNbre() {
		return nbre;
	}

	public void setNbre(int nbre) {
		this.nbre = nbre;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	public Set<Projet> getProjet() {
		return Projet;
	}

	public void setProjet(Set<Projet> projet) {
		Projet = projet;
	}

	public Set<Chat> getChat() {
		return Chat;
	}

	public void setChat(Set<Chat> chat) {
		Chat = chat;
	}

	public Equipe(Long id, String nom, int nbre, tn.gestion.projets.spring.entity.User user,
			Set<tn.gestion.projets.spring.entity.Projet> projet, Set<tn.gestion.projets.spring.entity.Chat> chat) {
		super();
		this.id = id;
		this.nom = nom;
		this.nbre = nbre;
		User = user;
		Projet = projet;
		Chat = chat;
	}

	public Equipe(String nom, int nbre, tn.gestion.projets.spring.entity.User user,
			Set<tn.gestion.projets.spring.entity.Projet> projet, Set<tn.gestion.projets.spring.entity.Chat> chat) {
		super();
		this.nom = nom;
		this.nbre = nbre;
		User = user;
		Projet = projet;
		Chat = chat;
	}
	
	
	

}
