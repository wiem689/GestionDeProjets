package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.Likes;

public interface ILikesService {
	
	Likes addLikes(Likes l);
	boolean deleteLikes(long id);
	Likes updateLikes( Likes l);
	List<Likes> retrieveAllLikes();
	Likes retrieveLikes(Long id);

}
