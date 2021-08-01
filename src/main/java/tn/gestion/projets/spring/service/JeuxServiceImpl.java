package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Jeux;
import tn.gestion.projets.spring.entity.LikeComments;
import tn.gestion.projets.spring.repository.JeuxRepository;

@Service
public class JeuxServiceImpl implements IJeuxService {
	
	@Autowired
	JeuxRepository lr ;
	
	private static final Logger l = LogManager.getLogger(JeuxServiceImpl.class);

	@Override
	public Jeux addJeux(Jeux j) {
		return lr.save(j) ;
	}

	@Override
	public boolean deleteJeux(long id) {
		if(lr.existsById(id)){
			lr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public Jeux updateJeux(Jeux j) {
		return lr.save(j);
	}

	@Override
	public List<Jeux> retrieveAllJeux() {
		List<Jeux> Jeux = (List<Jeux>) lr.findAll();
		for(Jeux jeux : Jeux){
			l.info("jeux :" + jeux);
		}
		return Jeux;
	}

	@Override
	public Jeux retrieveJeux(Long id) {
		return lr.findById(id).get();
	}

}
