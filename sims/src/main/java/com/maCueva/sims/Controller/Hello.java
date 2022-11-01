package com.maCueva.sims.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController; 

@RestController

public class Hello {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() { 
		return "Hello, Mark Vincent Cueva! BSIT-3 G1"; 
	}
}
