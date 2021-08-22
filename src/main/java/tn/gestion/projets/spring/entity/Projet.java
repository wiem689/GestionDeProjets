package tn.gestion.projets.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Projet implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date date ;
	
	private String nom ;
	private String confidentialite ;
	private String description ;
	
	
	
	@ManyToOne
	User User;
	
	@ManyToOne
	Payment Payment;
	
	@ManyToOne
	Equipe Equipe;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Projet")
	private Set<Chat> Chat;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Projet")
	private Set<Sprint> Sprint;

	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getConfidentialite() {
		return confidentialite;
	}

	public void setConfidentialite(String confidentialite) {
		this.confidentialite = confidentialite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

	public Payment getPayment() {
		return Payment;
	}

	public void setPayment(Payment payment) {
		Payment = payment;
	}

	public Equipe getEquipe() {
		return Equipe;
	}

	public void setEquipe(Equipe equipe) {
		Equipe = equipe;
	}

	public Set<Chat> getChat() {
		return Chat;
	}

	public void setChat(Set<Chat> chat) {
		Chat = chat;
	}

	public Set<Sprint> getSprint() {
		return Sprint;
	}

	public void setSprint(Set<Sprint> sprint) {
		Sprint = sprint;
	}

	public Projet(Long id, Date date, String nom, String confidentialite, String description,
			tn.gestion.projets.spring.entity.User user, tn.gestion.projets.spring.entity.Payment payment,
			tn.gestion.projets.spring.entity.Equipe equipe, Set<tn.gestion.projets.spring.entity.Chat> chat,
			Set<tn.gestion.projets.spring.entity.Sprint> sprint) {
		super();
		this.id = id;
		this.date = date;
		this.nom = nom;
		this.confidentialite = confidentialite;
		this.description = description;
		User = user;
		Payment = payment;
		Equipe = equipe;
		Chat = chat;
		Sprint = sprint;
	}

	public Projet(Date date, String nom, String confidentialite, String description,
			tn.gestion.projets.spring.entity.User user, tn.gestion.projets.spring.entity.Payment payment,
			tn.gestion.projets.spring.entity.Equipe equipe, Set<tn.gestion.projets.spring.entity.Chat> chat,
			Set<tn.gestion.projets.spring.entity.Sprint> sprint) {
		super();
		this.date = date;
		this.nom = nom;
		this.confidentialite = confidentialite;
		this.description = description;
		User = user;
		Payment = payment;
		Equipe = equipe;
		Chat = chat;
		Sprint = sprint;
	}
	
	
	

}
