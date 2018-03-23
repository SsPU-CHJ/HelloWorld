package cn.citasgoo.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/helloWorld")
	public String helloWorld() {
		return "index";
	}
}
