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



@Entity
public class Taches implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	private String description ;
	
	//
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Taches")
	private Set<Likes> Like;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Taches")
	private Set<Etiquette> Etiquette;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Taches")
	private Set<Commentaire> Commentaire;
	
	@ManyToOne
	Sprint Sprint;
	
	@ManyToOne
	Calendrier Calendrier;
	
	@ManyToOne
	Fin Fin;
	
	@ManyToOne
	Traitement Traitement;
	
	@ManyToOne
	Creation Creation;

	public Taches() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Likes> getLike() {
		return Like;
	}

	public void setLike(Set<Likes> like) {
		Like = like;
	}

	public Set<Etiquette> getEtiquette() {
		return Etiquette;
	}

	public void setEtiquette(Set<Etiquette> etiquette) {
		Etiquette = etiquette;
	}

	public Set<Commentaire> getCommentaire() {
		return Commentaire;
	}

	public void setCommentaire(Set<Commentaire> commentaire) {
		Commentaire = commentaire;
	}

	public Sprint getSprint() {
		return Sprint;
	}

	public void setSprint(Sprint sprint) {
		Sprint = sprint;
	}

	public Calendrier getCalendrier() {
		return Calendrier;
	}

	public void setCalendrier(Calendrier calendrier) {
		Calendrier = calendrier;
	}

	public Fin getFin() {
		return Fin;
	}

	public void setFin(Fin fin) {
		Fin = fin;
	}

	public Traitement getTraitement() {
		return Traitement;
	}

	public void setTraitement(Traitement traitement) {
		Traitement = traitement;
	}

	public Creation getCreation() {
		return Creation;
	}

	public void setCreation(Creation creation) {
		Creation = creation;
	}
	
	//.

	public Taches(Long id, Date date, String description, Set<tn.gestion.projets.spring.entity.Likes> like,
			Set<tn.gestion.projets.spring.entity.Etiquette> etiquette,
			Set<tn.gestion.projets.spring.entity.Commentaire> commentaire,
			tn.gestion.projets.spring.entity.Sprint sprint, tn.gestion.projets.spring.entity.Calendrier calendrier,
			tn.gestion.projets.spring.entity.Fin fin, tn.gestion.projets.spring.entity.Traitement traitement,
			tn.gestion.projets.spring.entity.Creation creation) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
		Like = like;
		Etiquette = etiquette;
		Commentaire = commentaire;
		Sprint = sprint;
		Calendrier = calendrier;
		Fin = fin;
		Traitement = traitement;
		Creation = creation;
	}

	public Taches(Date date, String description, Set<tn.gestion.projets.spring.entity.Likes> like,
			Set<tn.gestion.projets.spring.entity.Etiquette> etiquette,
			Set<tn.gestion.projets.spring.entity.Commentaire> commentaire,
			tn.gestion.projets.spring.entity.Sprint sprint, tn.gestion.projets.spring.entity.Calendrier calendrier,
			tn.gestion.projets.spring.entity.Fin fin, tn.gestion.projets.spring.entity.Traitement traitement,
			tn.gestion.projets.spring.entity.Creation creation) {
		super();
		this.date = date;
		this.description = description;
		Like = like;
		Etiquette = etiquette;
		Commentaire = commentaire;
		Sprint = sprint;
		Calendrier = calendrier;
		Fin = fin;
		Traitement = traitement;
		Creation = creation;
	}
	
	
	
	
}
