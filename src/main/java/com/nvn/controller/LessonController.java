package com.nvn.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nvn.entities.Customer;
import com.nvn.entities.Lesson;
import com.nvn.service.CategoryService;
import com.nvn.service.LessonService;
import com.nvn.util.Util;

@Controller
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/test")
	@ResponseBody
	public Lesson test() {
		return (Lesson) lessonService.getAll("C").get(0);
	}
	
	@RequestMapping("/{subject}")
	public String getLesson(@PathVariable String subject,Model model) {
		model.addAttribute("listLesson", lessonService.getAll(subject));
		model.addAttribute("listCategory", categoryService.getAll());
		model.addAttribute("url", Util.getUrl());
		return "Subject/listsubject";
	}
	
	@RequestMapping("/{subject}/{url}")
	public String viewLessonByUrl(@PathVariable String subject,@PathVariable String url, Model model) {
		Lesson lesson = lessonService.findByName(subject, url);
		model.addAttribute("lesson", lesson);
		model.addAttribute("listLesson", lessonService.getAll(subject));
		model.addAttribute("url", Util.getUrl());
		return "Subject/subjectdetail";
	}
	
}
