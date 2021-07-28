package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Calendrier;
import tn.gestion.projets.spring.repository.CalendrierRepository;

@Service
public class CalendrierService {
	
	@Autowired
	CalendrierRepository cr;
			
		
		private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

		
		public Calendrier addCalendrier(Calendrier c) {
			return cr.save(c);
		}

		
		public boolean deleteCalendrier(long id) {
			if(cr.existsById(id)){
				cr.deleteById(id);
				return true;
			}
			else{
			return false;
			}
		}

		public Calendrier updateCalendrier(Calendrier c) {
			return cr.save(c);
		}

		
		public List<Calendrier> retrieveAllCalendrier() {
			List<Calendrier> calendrier = (List<Calendrier>) cr.findAll();
			for(Calendrier c : calendrier){
				l.info("taches :" + c);
			}
			return calendrier;
		}

		
		public Calendrier retrieveCalendrier(Long id) {
			return cr.findById(id).get();

		}

}
