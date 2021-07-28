package tn.gestion.projets.spring.entity;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Calendrier implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date date = new Date();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Calendrier")
	private Set<Taches> Taches;

	public Calendrier() {
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

	public Set<Taches> getTaches() {
		return Taches;
	}

	public void setTaches(Set<Taches> taches) {
		Taches = taches;
	}

	public Calendrier(Date date, Set<tn.gestion.projets.spring.entity.Taches> taches) {
		super();
		this.date = date;
		Taches = taches;
	}
	
	
	

}
