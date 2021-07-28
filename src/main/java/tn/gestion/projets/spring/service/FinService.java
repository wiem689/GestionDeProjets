package tn.gestion.projets.spring.service;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Fin;
import tn.gestion.projets.spring.repository.FinRepository;






					@Service
					public class FinService {
						
						@Autowired
						FinRepository fr;
								
							
						private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

						
						public Fin addFin(Fin e) {
							return fr.save(e);
						}

						
						public boolean deleteFin(long id) {
							if(fr.existsById(id)){
								fr.deleteById(id);
								return true;
							}
							else{
							return false;
							}
						}

						public Fin updateFin(Fin e) {
							return fr.save(e);
						}

						
						public List<Fin> retrieveAllFin() {
							List<Fin> favorirecherche = (List<Fin>) fr.findAll();
							for(Fin e : favorirecherche){
								l.info("taches :" + e);
							}
							return favorirecherche;
						}

						
						public Fin retrieveFin(Long id) {
							return fr.findById(id).get();

						}

			

}

