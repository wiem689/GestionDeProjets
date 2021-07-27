package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Taches;
import tn.gestion.projets.spring.repository.TachesRepository;

@Service
public class TachesServiceImpl implements ITachesService {
	
	@Autowired
	TachesRepository tacheRepo ;
	
	private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

	@Override
	public Taches addTaches(Taches t) {
		return tacheRepo.save(t);
	}

	@Override
	public boolean deleteTaches(long id) {
		if(tacheRepo.existsById(id)){
			tacheRepo.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public Taches updateTaches(Taches t) {
		return tacheRepo.save(t);
	}

	@Override
	public List<Taches> retrieveAllTaches() {
		List<Taches> Taches = (List<Taches>) tacheRepo.findAll();
		for(Taches taches : Taches){
			l.info("taches :" + taches);
		}
		return Taches;
	}

	@Override
	public Taches retrieveTaches(Long id) {
		return tacheRepo.findById(id).get();

	}


}
