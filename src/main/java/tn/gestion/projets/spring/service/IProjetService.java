package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Projet;

public interface IProjetService {
	
	String addProjet(Projet projet, String user_id);
	boolean deleteProjet(long id , long userId);
	Projet updateProjet( Projet p);
	List<Projet> retrieveAllProjet();
	Projet retrieveProjet(Long id);

}
