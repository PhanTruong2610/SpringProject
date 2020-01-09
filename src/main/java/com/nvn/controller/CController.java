package com.nvn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nvn.entitie.Lesson;
import com.nvn.service.CService;

@Controller
public class CController {
	
	@Autowired
	private CService cService;
	
	@RequestMapping("/c")
	public String doSaveCustomer(@ModelAttribute("Lesson") Lesson lesson, Model model) {
		cService.save(lesson);
		model.addAttribute("listCustomer", cService.findAll());
		return "C/c";
	}
}
