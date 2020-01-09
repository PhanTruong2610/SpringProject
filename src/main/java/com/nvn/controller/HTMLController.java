package com.nvn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nvn.entitie.Lesson;
import com.nvn.service.CService;
import com.nvn.service.HTMLService;

@Controller
public class HTMLController {
	
	@Autowired
	private HTMLService htmlService;
	
	@RequestMapping("/html")
	public String doSaveCustomer(Model model) {
		//htmlService.save(lesson);
		model.addAttribute("listHTML", htmlService.findAll());
		return "HTML/html";
	}
}
