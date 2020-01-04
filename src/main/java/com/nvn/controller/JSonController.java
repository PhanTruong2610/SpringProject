package com.nvn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nvn.entitie.User;

@Controller
public class JSonController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/json")
	@ResponseBody
	public User testJSON() {
		User user = new User(1, "kai", "abc@gmail.com");
		return user;
	}

	@RequestMapping("/list-json")
	@ResponseBody
	public List<User> testListJSON() {
		List<User> listUser = new ArrayList<User>();
		listUser.add(new User(1, "kai", "abc@gmail.com"));
		listUser.add(new User(2, "stack", "def@yahoo.com"));
		return listUser;
	}

}
