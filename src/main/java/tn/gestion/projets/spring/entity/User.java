package tn.gestion.projets.spring.entity;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



@Entity
@Table(	name = "users", 
		uniqueConstraints = { 
			@UniqueConstraint(columnNames = "username"),
			@UniqueConstraint(columnNames = "email") 
		})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 20)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(max = 120)
	private String password;
	
	

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
	}

	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	


	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Jeux> Jeux;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Favorirecherche> Favorirecherche;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Notification> Notification;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Conversation> Conversation;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<LikeComments> LikeComments;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Likes> Likes;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Projet> Projet;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="User")
	private Set<Equipe> Equipe;




	

	

}
