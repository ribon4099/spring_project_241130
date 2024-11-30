package com.a.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	//http://localhost:8080/test/1 
	@RequestMapping("/test/1")
	@ResponseBody
	public String ex1() {
		return "<h2>Hello world</h2>";
	}
}
