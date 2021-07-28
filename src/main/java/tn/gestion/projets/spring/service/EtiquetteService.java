package tn.gestion.projets.spring.service;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Etiquette;
import tn.gestion.projets.spring.repository.EtiquetteRepository;




					@Service
					public class EtiquetteService {
						
						@Autowired
						EtiquetteRepository er;
								
							
						private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

						
						public Etiquette addEtiquette(Etiquette e) {
							return er.save(e);
						}

						
						public boolean deleteEtiquette(long id) {
							if(er.existsById(id)){
								er.deleteById(id);
								return true;
							}
							else{
							return false;
							}
						}

						public Etiquette updateEtiquette(Etiquette e) {
							return er.save(e);
						}

						
						public List<Etiquette> retrieveAllEtiquette() {
							List<Etiquette> etiquette = (List<Etiquette>) er.findAll();
							for(Etiquette e : etiquette){
								l.info("taches :" + e);
							}
							return etiquette;
						}

						
						public Etiquette retrieveEtiquette(Long id) {
							return er.findById(id).get();

						}

			

}
