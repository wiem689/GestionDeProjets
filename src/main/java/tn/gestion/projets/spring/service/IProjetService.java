package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Projet;

public interface IProjetService {
	
	Projet addProjet(Projet p);
	boolean deleteProjet(long id);
	Projet updateProjet( Projet p);
	List<Projet> retrieveAllProjet();
	Projet retrieveProjet(Long id);

}
