package tn.gestion.projets.spring.service;

import java.util.List;

import tn.gestion.projets.spring.entity.User;



public interface IUserService {
	
	User addUser(User u);
	boolean deleteUser(long id);
	User updateUser( User u);
	List<User> retrieveAllUser();
	User retrieveUser(Long id);

}
