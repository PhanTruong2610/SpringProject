package com.nvn.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.nvn.entitie.Account;
//import com.nvn.entitie.AccountMapper;

@Controller
public class LoginController {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value="/login")
	public String login() {
		return "Login/login";
	}
	
/*	@RequestMapping(value= {"/","home"})
	public String login(HttpServletRequest request,@ModelAttribute("account") Account account) {
		//tên thuộc tính bên jsp phải trùng với model nó sẽ tự động link
		//if(account.getUserName().equals("devmaster") && account.getPassword().equals("devmaster")) return "main";
		//if(doLogin(account)) return "main";
		return "HOME/home";
	}
	
	public boolean doLogin(Account account) {
		try {
			String sql="SELECT * FROM student.account where user = ? and password =?";
			account = jdbcTemplate.queryForObject(sql, new String[] {account.getUserName(),account.getPassword()}, new AccountMapper());
			if(account!=null) return true;
		} catch (Exception e) {
			return false;
		}
		return false;
	}*/
}
