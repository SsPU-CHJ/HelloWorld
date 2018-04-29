package cn.citasgoo.helloworld;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public Boolean reg(String username, String password) {
		User user = new User();
		user.setUid(UUID.randomUUID().toString().replace("-", ""));
		user.setUsername(username);
		user.setPassword(password);
		user.setRegtime(new Date());
		Integer i = userDao.reg(user);
		if (i > 0) {
			return true;
		}
		return false;
	}

	public List<Ticket> getTickets() {
		return userDao.getTickets();
	}

	public List getUsers() {
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		return al;
	}

}
