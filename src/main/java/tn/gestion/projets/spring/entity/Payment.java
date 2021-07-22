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
public class Payment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private boolean payment ;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="Payment")
	private Set<Projet> Projet;


	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public boolean isPayment() {
		return payment;
	}


	public void setPayment(boolean payment) {
		this.payment = payment;
	}


	public Set<Projet> getProjet() {
		return Projet;
	}


	public void setProjet(Set<Projet> projet) {
		Projet = projet;
	}


	public Payment(Long id, boolean payment, Set<tn.gestion.projets.spring.entity.Projet> projet) {
		super();
		this.id = id;
		this.payment = payment;
		Projet = projet;
	}


	public Payment(boolean payment, Set<tn.gestion.projets.spring.entity.Projet> projet) {
		super();
		this.payment = payment;
		Projet = projet;
	}
	
	
	
	

}
