package tn.gestion.projets.spring.service;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.gestion.projets.spring.entity.Equipe;
import tn.gestion.projets.spring.repository.EquipeRepository;



					@Service
					public class EquipeService {
						
						@Autowired
						EquipeRepository er;
								
							
						private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

						
						public Equipe addEquipe(Equipe e) {
							return er.save(e);
						}

						
						public boolean deleteEquipe(long id) {
							if(er.existsById(id)){
								er.deleteById(id);
								return true;
							}
							else{
							return false;
							}
						}

						public Equipe updateEquipe(Equipe e) {
							return er.save(e);
						}

						
						public List<Equipe> retrieveAllEquipe() {
							List<Equipe> equipe = (List<Equipe>) er.findAll();
							for(Equipe e : equipe){
								l.info("taches :" + e);
							}
							return equipe;
						}

						
						public Equipe retrieveEquipe(Long id) {
							return er.findById(id).get();

						}

			

		


}