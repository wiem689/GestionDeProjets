package tn.gestion.projets.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Etiquette implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String type ;
	
	@ManyToOne
	Taches Taches;

	public Etiquette() {
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

	public Taches getTaches() {
		return Taches;
	}

	public void setTaches(Taches taches) {
		Taches = taches;
	}

	public Etiquette(Long id, String type, tn.gestion.projets.spring.entity.Taches taches) {
		super();
		this.id = id;
		this.type = type;
		Taches = taches;
	}

	public Etiquette(String type, tn.gestion.projets.spring.entity.Taches taches) {
		super();
		this.type = type;
		Taches = taches;
	}
	
	


}
