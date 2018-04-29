package cn.citasgoo.helloworld;

import java.util.List;

public interface UserService {

	Boolean reg(String username, String password);

	List<Ticket> getTickets();

	List getUsers();

}
