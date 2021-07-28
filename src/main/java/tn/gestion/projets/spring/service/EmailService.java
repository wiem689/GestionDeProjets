package tn.gestion.projets.spring.service;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Email;
import tn.gestion.projets.spring.repository.EmailRepository;


					@Service
					public class EmailService {
						
						@Autowired
						EmailRepository er;
								
							
						private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

						
						public Email addEmail(Email e) {
							return er.save(e);
						}

						
						public boolean deleteEmail(long id) {
							if(er.existsById(id)){
								er.deleteById(id);
								return true;
							}
							else{
							return false;
							}
						}

						public Email updateEmail(Email e) {
							return er.save(e);
						}

						
						public List<Email> retrieveAllEmail() {
							List<Email> email = (List<Email>) er.findAll();
							for(Email e : email){
								l.info("taches :" + e);
							}
							return email;
						}

						
						public Email retrieveEmail(Long id) {
							return er.findById(id).get();

						}

			

		


}
