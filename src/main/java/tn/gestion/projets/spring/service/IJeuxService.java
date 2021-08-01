package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Jeux;


public interface IJeuxService {

	
	Jeux addJeux(Jeux j);
	boolean deleteJeux(long id);
	Jeux updateJeux( Jeux j);
	List<Jeux> retrieveAllJeux();
	Jeux retrieveJeux(Long id);

}
