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
public class Sprint implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date date ;
	
	private int nbre ;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Sprint")
	private Set<Taches> Taches;
	
	@ManyToOne
	Projet Projet;

	public Sprint() {
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

	public int getNbre() {
		return nbre;
	}

	public void setNbre(int nbre) {
		this.nbre = nbre;
	}

	public Set<Taches> getTaches() {
		return Taches;
	}

	public void setTaches(Set<Taches> taches) {
		Taches = taches;
	}

	public Projet getProjet() {
		return Projet;
	}

	public void setProjet(Projet projet) {
		Projet = projet;
	}

	public Sprint(Long id, Date date, int nbre, Set<tn.gestion.projets.spring.entity.Taches> taches,
			tn.gestion.projets.spring.entity.Projet projet) {
		super();
		this.id = id;
		this.date = date;
		this.nbre = nbre;
		Taches = taches;
		Projet = projet;
	}

	public Sprint(Date date, int nbre, Set<tn.gestion.projets.spring.entity.Taches> taches,
			tn.gestion.projets.spring.entity.Projet projet) {
		super();
		this.date = date;
		this.nbre = nbre;
		Taches = taches;
		Projet = projet;
	}
	
	
	
	
	


}
