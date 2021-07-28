package tn.gestion.projets.spring.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Conversation;
import tn.gestion.projets.spring.repository.ConversationRepository;

				@Service
				public class ConversationService {
					
					@Autowired
					ConversationRepository cr;
							
						
					private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

					
					public Conversation addConversation(Conversation c) {
						return cr.save(c);
					}

					
					public boolean deleteConversation(long id) {
						if(cr.existsById(id)){
							cr.deleteById(id);
							return true;
						}
						else{
						return false;
						}
					}

					public Conversation updateConversation(Conversation c) {
						return cr.save(c);
					}

					
					public List<Conversation> retrieveAllConversation() {
						List<Conversation> conversation = (List<Conversation>) cr.findAll();
						for(Conversation c : conversation){
							l.info("taches :" + c);
						}
						return conversation;
					}

					
					public Conversation retrieveConversation(Long id) {
						return cr.findById(id).get();

					}

		

	

}
