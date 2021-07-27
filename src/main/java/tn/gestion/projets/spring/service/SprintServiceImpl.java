package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Sprint;
import tn.gestion.projets.spring.repository.SprintRepository;

@Service
public class SprintServiceImpl implements ISprintService {
	
	@Autowired
	SprintRepository sr ;
	
	private static final Logger l = LogManager.getLogger(SprintServiceImpl.class);


	@Override
	public Sprint addSprint(Sprint t) {
		return sr.save(t);
	}

	@Override
	public boolean deleteSprint(long id) {
		if(sr.existsById(id)){
			sr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public Sprint updateSprint(Sprint t) {
		return sr.save(t);
	}

	@Override
	public List<Sprint> retrieveAllSprint() {
		List<Sprint> Sprint = (List<Sprint>) sr.findAll();
		for(Sprint sprint : Sprint){
			l.info("sprint :" + sprint);
		}
		return Sprint;	}

	@Override
	public Sprint retrieveSprint(Long id) {
		return sr.findById(id).get();

	}

}
