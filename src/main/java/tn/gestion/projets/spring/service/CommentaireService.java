package tn.gestion.projets.spring.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Commentaire;
import tn.gestion.projets.spring.repository.CommentaireRepository;

			@Service
			public class CommentaireService {
				
				@Autowired
				CommentaireRepository cr;
						
					
				private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

				
				public Commentaire addCommentaire(Commentaire c) {
					return cr.save(c);
				}

				
				public boolean deleteCommentaire(long id) {
					if(cr.existsById(id)){
						cr.deleteById(id);
						return true;
					}
					else{
					return false;
					}
				}

				public Commentaire updateCommentaire(Commentaire c) {
					return cr.save(c);
				}

				
				public List<Commentaire> retrieveAllCommentaire() {
					List<Commentaire> commentaire = (List<Commentaire>) cr.findAll();
					for(Commentaire c : commentaire){
						l.info("taches :" + c);
					}
					return commentaire;
				}

				
				public Commentaire retrieveCommentaire(Long id) {
					return cr.findById(id).get();

				}

	

}
