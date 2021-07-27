package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Sprint;

public interface ISprintService {
	
	Sprint addSprint(Sprint t);
	boolean deleteSprint(long id);
	Sprint updateSprint( Sprint t);
	List<Sprint> retrieveAllSprint();
	Sprint retrieveSprint(Long id);

}
