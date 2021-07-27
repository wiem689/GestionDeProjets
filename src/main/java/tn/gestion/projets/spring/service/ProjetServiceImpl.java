package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Projet;
import tn.gestion.projets.spring.repository.ProjetRepository;

@Service
public class ProjetServiceImpl implements IProjetService {
	
	@Autowired
	ProjetRepository pr ;
	
	private static final Logger l = LogManager.getLogger(ProjetServiceImpl.class);


	@Override
	public Projet addProjet(Projet p) {
		return pr.save(p);
	}

	@Override
	public boolean deleteProjet(long id) {
		if(pr.existsById(id)){
			pr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public Projet updateProjet(Projet p) {
		return pr.save(p);
	}

	@Override
	public List<Projet> retrieveAllProjet() {
		List<Projet> Projet = (List<Projet>) pr.findAll();
		for(Projet projet : Projet){
			l.info("projet :" + projet);
		}
		return Projet;
	}

	@Override
	public Projet retrieveProjet(Long id) {
		return pr.findById(id).get();

	}

}
