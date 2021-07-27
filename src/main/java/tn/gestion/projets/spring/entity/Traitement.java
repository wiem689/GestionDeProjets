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
public class Traitement implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date date ; 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Traitement")
	private Set<Taches> Taches;

	public Traitement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Taches> getTaches() {
		return Taches;
	}

	public void setTaches(Set<Taches> taches) {
		Taches = taches;
	}

	

	public Traitement(Long id, Date date, Set<tn.gestion.projets.spring.entity.Taches> taches) {
		super();
		this.id = id;
		this.date = date;
		Taches = taches;
	}

	public Traitement(Date date, Set<tn.gestion.projets.spring.entity.Taches> taches) {
		super();
		this.date = date;
		Taches = taches;
	}

	
	
	
	

}
