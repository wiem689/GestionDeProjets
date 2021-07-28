package tn.gestion.projets.spring.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.gestion.projets.spring.entity.Chat;
import tn.gestion.projets.spring.repository.ChatRepository;

	@Service
	public class ChatService {
		
		@Autowired
		ChatRepository chr;
				
			
			private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

			
			public Chat addChat(Chat c) {
				return chr.save(c);
			}

			
			public boolean deleteChat(long id) {
				if(chr.existsById(id)){
					chr.deleteById(id);
					return true;
				}
				else{
				return false;
				}
			}

			public Chat updateChat(Chat c) {
				return chr.save(c);
			}

			
			public List<Chat> retrieveAllChat() {
				List<Chat> chat = (List<Chat>) chr.findAll();
				for(Chat c : chat){
					l.info("taches :" + c);
				}
				return chat;
			}

			
			public Chat retrieveChat(Long id) {
				return chr.findById(id).get();

			}

	


}
