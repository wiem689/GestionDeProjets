package tn.gestion.projets.spring.service;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Creation;
import tn.gestion.projets.spring.repository.CreationRepository;

					@Service
					public class CreationService {
						
						@Autowired
						CreationRepository cr;
								
							
						private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

						
						public Creation addClaim(Creation c) {
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

						public Creation updateCommentaire(Creation c) {
							return cr.save(c);
						}

						
						public List<Creation> retrieveAllCommentaire() {
							List<Creation> creation = (List<Creation>) cr.findAll();
							for(Creation c : creation){
								l.info("taches :" + c);
							}
							return creation;
						}

						
						public Creation retrieveConversation(Long id) {
							return cr.findById(id).get();

						}

			

		


}
