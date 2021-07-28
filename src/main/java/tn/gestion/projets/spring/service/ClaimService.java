package tn.gestion.projets.spring.service;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.gestion.projets.spring.entity.Claim;
import tn.gestion.projets.spring.repository.ClaimRepository;

		@Service
		public class ClaimService {
			
			@Autowired
			ClaimRepository cr;
					
				
			private static final Logger l = LogManager.getLogger(TachesServiceImpl.class);

			
			public Claim addClaim(Claim c) {
				return cr.save(c);
			}

			
			public boolean deleteClaim(long id) {
				if(cr.existsById(id)){
					cr.deleteById(id);
					return true;
				}
				else{
				return false;
				}
			}

			public Claim updateClaim(Claim c) {
				return cr.save(c);
			}

			
			public List<Claim> retrieveAllClaim() {
				List<Claim> claim = (List<Claim>) cr.findAll();
				for(Claim c : claim){
					l.info("taches :" + c);
				}
				return claim;
			}

			
			public Claim retrieveClaim(Long id) {
				return cr.findById(id).get();

			}

}

