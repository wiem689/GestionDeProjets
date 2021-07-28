package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.Likes;
import tn.gestion.projets.spring.repository.LikesRepository;

@Service
public class LikesServiceImpl implements ILikesService {
	
	@Autowired
	LikesRepository lr ;
	
	private static final Logger l = LogManager.getLogger(LikesServiceImpl.class);

	
	

	@Override
	public Likes addLikes(Likes l) {
		return lr.save(l);
	}

	@Override
	public boolean deleteLikes(long id) {
		if(lr.existsById(id)){
			lr.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public Likes updateLikes(Likes l) {
		return lr.save(l);
	}

	@Override
	public List<Likes> retrieveAllLikes() {
		List<Likes> Likes = (List<Likes>) lr.findAll();
		for(Likes likes : Likes){
			l.info("likes :" + likes);
		}
		return Likes;
	}

	@Override
	public Likes retrieveLikes(Long id) {
		return lr.findById(id).get();
	}

}
