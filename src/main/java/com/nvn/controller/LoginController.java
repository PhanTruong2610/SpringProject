package com.nvn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/login")
	public String login() {
		return "Login/login";
	}
}
