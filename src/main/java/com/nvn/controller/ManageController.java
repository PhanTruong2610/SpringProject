package com.nvn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nvn.entities.Lesson;
//import com.nvn.model.Lesson;
import com.nvn.service.LessonService;


@Controller
public class ManageController {
	@Autowired
	LessonService lessonService;
	
	@RequestMapping(value="/manage")
	public String viewManage(Model model, @ModelAttribute("lesson") Lesson lesson) {
		return "MANAGE/manage";
	}
	
	@RequestMapping(value ="/insert")
	public String insert(Model model, @ModelAttribute("lesson") Lesson lesson) {
		lessonService.insert("",lesson);
		return "redirect:html";
	}
}
