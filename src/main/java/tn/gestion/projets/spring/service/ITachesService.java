package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Taches;

public interface ITachesService {
	
	Taches addTaches(Taches t);
	boolean deleteTaches(long id);
	Taches updateTaches( Taches t);
	List<Taches> retrieveAllTaches();
	Taches retrieveTaches(Long id);

}
