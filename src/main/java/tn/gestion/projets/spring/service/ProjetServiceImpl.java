package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Projet;
import tn.gestion.projets.spring.entity.User;
import tn.gestion.projets.spring.repository.ProjetRepository;
import tn.gestion.projets.spring.repository.UserRepository;

@Service
public class ProjetServiceImpl implements IProjetService {
	
	public String msg;
	
	@Autowired
	ProjetRepository pr ;
	
	@Autowired
	UserRepository ur ;
	
	private static final Logger l = LogManager.getLogger(ProjetServiceImpl.class);


	

	

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

	@Override
	public String addProjet(Projet projet, String user_id) {
    User u = ur.findById ( Long.parseLong(user_id)).get();
		
		
     projet.setUser(u);
     pr.save(projet); 
		 
		 return msg= "add successful ";

	}

	@Override
	public boolean deleteProjet(long id, long userId) {

		Projet projet = pr.findById(id).get();
		if (projet.getUser().getId()==userId){
			pr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	

}
