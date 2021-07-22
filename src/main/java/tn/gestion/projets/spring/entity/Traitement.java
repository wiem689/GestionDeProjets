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
public class Traitement implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Traitement")
	private Set<Taches> Taches;

	public Traitement() {
		super();
		// TODO Auto-generated constructor stub
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

	public Traitement(Long id, Set<tn.gestion.projets.spring.entity.Taches> taches) {
		super();
		this.id = id;
		Taches = taches;
	}

	public Traitement(Set<tn.gestion.projets.spring.entity.Taches> taches) {
		super();
		Taches = taches;
	}
	
	
	

}
