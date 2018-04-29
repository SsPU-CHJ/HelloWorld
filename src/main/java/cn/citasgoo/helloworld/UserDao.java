package cn.citasgoo.helloworld;

import java.util.List;

public interface UserDao {

	Integer reg(User user);

	List<Ticket> getTickets();

}
