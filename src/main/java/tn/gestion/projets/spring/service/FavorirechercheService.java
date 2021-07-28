package tn.gestion.projets.spring.service;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Favorirecherche;
import tn.gestion.projets.spring.repository.FavorirechercheRepository;





					@Service
					public class FavorirechercheService {
						
						@Autowired
						FavorirechercheRepository fr;
								
							
						private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

						
						public Favorirecherche addFavorirecherche(Favorirecherche e) {
							return fr.save(e);
						}

						
						public boolean deleteFavorirecherche(long id) {
							if(fr.existsById(id)){
								fr.deleteById(id);
								return true;
							}
							else{
							return false;
							}
						}

						public Favorirecherche updateFavorirecherche(Favorirecherche e) {
							return fr.save(e);
						}

						
						public List<Favorirecherche> retrieveAllFavorirecherche() {
							List<Favorirecherche> favorirecherche = (List<Favorirecherche>) fr.findAll();
							for(Favorirecherche e : favorirecherche){
								l.info("taches :" + e);
							}
							return favorirecherche;
						}

						
						public Favorirecherche retrieveFavorirecherche(Long id) {
							return fr.findById(id).get();

						}

			

}

