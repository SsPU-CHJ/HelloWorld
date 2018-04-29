package cn.citasgoo.helloworld;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/index")
	public String helloWorld() {
		return "index";
	}

	@RequestMapping(value = "/ChineseJson")
	public void ChineseJson(HttpServletResponse response) {
		JSONObject jo = new JSONObject();
		String string = "indexÊ×Ò³";
		jo.put("msg", string);
		response.setContentType("application/json;charset=UTF-8");
		try {
			response.getWriter().write(jo.toString());
		} catch (IOException e) {
			System.out.println("ÏµÍ³´íÎó£¡");
		}
	}
}
