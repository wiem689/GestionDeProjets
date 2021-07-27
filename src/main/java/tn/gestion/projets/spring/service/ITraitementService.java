package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Traitement;

public interface ITraitementService {
	
	Traitement addTraitement(Traitement t);
	boolean deleteTraitement(long id);
	Traitement updateTraitement( Traitement t);
	List<Traitement> retrieveAllTraitement();
	Traitement retrieveTraitement(Long id);

}
