package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.LikeComments;

public interface ILikeCommentsService {
	
	LikeComments addLikeComments(LikeComments l);
	boolean deleteLikeComments(long id);
	LikeComments updateLikeComments( LikeComments l);
	List<LikeComments> retrieveAllLikeComments();
	LikeComments retrieveLikeComments(Long id);

}
