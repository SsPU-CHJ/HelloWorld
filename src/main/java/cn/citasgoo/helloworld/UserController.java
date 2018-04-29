package cn.citasgoo.helloworld;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/reg", method = { RequestMethod.GET })
	private String reg() {
		return "reg";
	}

	@RequestMapping(value = "/reg", method = { RequestMethod.POST })
	private String reg(String username, String password) {
		if (userService.reg(username, password)) {
			return "ok";
		} else {
			return "failure";
		}
	}

	@RequestMapping(value = "/getUsers")
	private ModelAndView getUsers() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("users"); // 返回的文件名
		mav.addObject("users", userService.getUsers());
		return mav;
	}

	@RequestMapping(value = "/getTickets")
	private ModelAndView getTickets() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("tickets"); // 返回的文件名
		mav.addObject("tickets", userService.getTickets());
		return mav;
	}

}
