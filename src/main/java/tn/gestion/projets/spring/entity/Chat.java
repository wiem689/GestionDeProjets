package tn.gestion.projets.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Chat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String msg;
	
	
	@ManyToOne
	Projet Projet;
	
	@ManyToOne
	Equipe Equipe;

	public Chat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Projet getProjet() {
		return Projet;
	}

	public void setProjet(Projet projet) {
		Projet = projet;
	}

	public Equipe getEquipe() {
		return Equipe;
	}

	public void setEquipe(Equipe equipe) {
		Equipe = equipe;
	}

	public Chat(Long id, String msg, tn.gestion.projets.spring.entity.Projet projet,
			tn.gestion.projets.spring.entity.Equipe equipe) {
		super();
		this.id = id;
		this.msg = msg;
		Projet = projet;
		Equipe = equipe;
	}

	public Chat(String msg, tn.gestion.projets.spring.entity.Projet projet,
			tn.gestion.projets.spring.entity.Equipe equipe) {
		super();
		this.msg = msg;
		Projet = projet;
		Equipe = equipe;
	}
	
	


}
