package com.nvn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nvn.entities.Lesson;
//import com.nvn.model.Lesson;
import com.nvn.service.LessonService;
import com.nvn.util.Util;

@Controller
public class HTMLController {
	
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping("/html")
	public String getLesson(Model model) {
		model.addAttribute("listLesson", lessonService.getAll("html"));
		model.addAttribute("listCategory", lessonService.findAllCategory());
		model.addAttribute("url", Util.getUrl());
		return "Subject/listsubject";
	}
	
	@RequestMapping("/html/{url}")
	public String viewLessonByUrl(@PathVariable String url, Model model) {
		Lesson lesson = lessonService.findByName("html", url);
		model.addAttribute("lesson", lesson);
		model.addAttribute("listLesson", lessonService.getAll("html"));
		model.addAttribute("url", Util.getUrl());
		return "Subject/subjectdetail";
	}
	
}
