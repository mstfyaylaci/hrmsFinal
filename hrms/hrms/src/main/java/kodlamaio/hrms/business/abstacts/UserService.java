package kodlamaio.hrms.business.abstacts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.User;

public interface UserService {

	 List<User> getAll();
	    User add(User user);
}
