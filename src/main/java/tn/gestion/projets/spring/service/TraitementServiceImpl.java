package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Traitement;
import tn.gestion.projets.spring.repository.TraitementRepository;

@Service
public class TraitementServiceImpl implements ITraitementService{
	
	@Autowired
	TraitementRepository tr;
	
	private static final Logger l = LogManager.getLogger(TraitementServiceImpl.class);

	@Override
	public Traitement addTraitement(Traitement t) {
		return tr.save(t);
	}

	@Override
	public boolean deleteTraitement(long id) {
		if(tr.existsById(id)){
			tr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public Traitement updateTraitement(Traitement t) {
		return tr.save(t);
	}

	@Override
	public List<Traitement> retrieveAllTraitement() {
		List<Traitement> Traitement = (List<Traitement>) tr.findAll();
		for(Traitement traitement : Traitement){
			l.info("traitement :" + traitement);
		}
		return Traitement;
	}

	@Override
	public Traitement retrieveTraitement(Long id) {
		return tr.findById(id).get();
	}

}
