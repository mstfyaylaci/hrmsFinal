package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstacts.UserService;
import kodlamaio.hrms.dataAccess.abstacts.UserDao;
import kodlamaio.hrms.entities.concretes.User;

public class UserManager implements UserService {

	 @Autowired
	    private UserDao userDao;
	
	 @Override
		public List<User> getAll() {

		return userDao.findAll();
	}

	@Override
	public User add(User user) {
		return userDao.save(user);
    
	}

}
