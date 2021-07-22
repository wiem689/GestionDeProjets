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
public class Commentaire implements Serializable {
	
	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Commentaire")
	private Set<LikeComments> LikeComments;
	
	@ManyToOne
	private Taches Taches;

	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<LikeComments> getLikeComments() {
		return LikeComments;
	}

	public void setLikeComments(Set<LikeComments> likeComments) {
		LikeComments = likeComments;
	}

	public Taches getTaches() {
		return Taches;
	}

	public void setTaches(Taches taches) {
		Taches = taches;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Commentaire(Long id, String description, Set<tn.gestion.projets.spring.entity.LikeComments> likeComments,
			tn.gestion.projets.spring.entity.Taches taches) {
		super();
		this.id = id;
		this.description = description;
		LikeComments = likeComments;
		Taches = taches;
	}

	public Commentaire(String description, Set<tn.gestion.projets.spring.entity.LikeComments> likeComments,
			tn.gestion.projets.spring.entity.Taches taches) {
		super();
		this.description = description;
		LikeComments = likeComments;
		Taches = taches;
	}
	
	

}
