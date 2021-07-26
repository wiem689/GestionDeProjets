package tn.gestion.projets.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.gestion.projets.spring.entity.User;
import tn.gestion.projets.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository ur ;
	
	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);
	

	@Override
	public User addUser(User u) {
		return ur.save(u);
	}

	@Override
	public boolean deleteUser(long id) {
		if(ur.existsById(id)){
			ur.deleteById(id);
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public User updateUser(User u) {
		return ur.save(u); 	}

	@Override
	public List<User> retrieveAllUser() {
		List<User> User = (List<User>) ur.findAll();
		for(User user : User){
			l.info("user :" + user);
		}
		return User;
	}

	@Override
	public User retrieveUser(Long id) {
		return ur.findById(id).get();	}

}
