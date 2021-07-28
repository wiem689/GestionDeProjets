package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.LikeComments;
import tn.gestion.projets.spring.repository.LikeCommentsRepository;

@Service
public class LikeCommentsServiceImpl implements ILikeCommentsService{
	
	@Autowired
	LikeCommentsRepository likeRepo ;
	
	private static final Logger l = LogManager.getLogger(LikeCommentsServiceImpl.class);


	@Override
	public LikeComments addLikeComments(LikeComments l) {
		return likeRepo.save(l);
	}

	@Override
	public boolean deleteLikeComments(long id) {
		if(likeRepo.existsById(id)){
			likeRepo.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public LikeComments updateLikeComments(LikeComments l) {
		return likeRepo.save(l);	}

	@Override
	public List<LikeComments> retrieveAllLikeComments() {
		List<LikeComments> LikeComments = (List<LikeComments>) likeRepo.findAll();
		for(LikeComments likeComments : LikeComments){
			l.info("likeComments :" + likeComments);
		}
		return LikeComments;
	}

	@Override
	public LikeComments retrieveLikeComments(Long id) {
		return likeRepo.findById(id).get();
	}

}
