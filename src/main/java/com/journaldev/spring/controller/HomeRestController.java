package com.journaldev.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	@RequestMapping(value = "/geet", method = RequestMethod.GET, produces="application/json")
	public String get() {
		return "{\"hi\":\"k\"}";
	}
}
