package tn.gestion.projets.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;

@Entity
public class EmailTemplate {
	//*
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String name ;
	
	@Email
	private String sendTo;
	@Max(value = 100)
	private String subject;
	@Max(value = 500)
	private String body;
	
	
	
	
	
	

	public EmailTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}



	public EmailTemplate(@Email String sendTo, @Max(100) String subject, @Max(500) String body ) {
		super();
		this.sendTo = sendTo;
		this.subject = subject;
		this.body = body;
	}
	
	

	public EmailTemplate(Long id, String name, @Email String sendTo, @Max(100) String subject, @Max(500) String body) {
		super();
		this.id = id;
		this.name = name;
		this.sendTo = sendTo;
		this.subject = subject;
		this.body = body;
	}
	
	



	public EmailTemplate(String name, @Email String sendTo, @Max(100) String subject, @Max(500) String body) {
		super();
		this.name = name;
		this.sendTo = sendTo;
		this.subject = subject;
		this.body = body;
	}



	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	


}
