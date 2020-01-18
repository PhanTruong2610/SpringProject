package com.nvn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.nvn.dao.LessonDAO;
import com.nvn.entities.Lesson;
import com.nvn.service.LessonService;

@Controller
public class HTMLController {
	
	@Autowired
	private LessonService lessonService;
	
	@Autowired
	private LessonDAO lessonDAO;
	
	
	@RequestMapping("/html")
	public String getLesson(Model model) {
		model.addAttribute("listLesson", lessonService.findAll("html"));
		//model.addAttribute("listLesson", lessonService.findAll());
		model.addAttribute("listCategory", lessonService.findAllCategory());
		//model.addAttribute("listCategory", lessonService.findCategory());
		model.addAttribute("url", getUrl());
		return "Subject/listsubject";
	}
	
/*	@RequestMapping("/html/{id}")
	public String viewLessonById(@PathVariable int id, Model model) {
		Lesson lesson = lessonService.findById(id);
		model.addAttribute("lesson", lesson);
		return "Subject/listsubject";
	}*/
	
	@RequestMapping("/html/{url}")
	public String viewLessonByUrl(@PathVariable String url, Model model) {
		Lesson lesson = lessonService.findByName("html", url);
		model.addAttribute("lesson", lesson);
		model.addAttribute("listLesson", lessonService.findAll("html"));
		model.addAttribute("url", getUrl());
		return "Subject/subjectdetail";
	}
	
	public String getUrl() {
		UriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentRequest();
        String context = builder.buildAndExpand().getPath();
        String[] list= context.split("/");
        return list[2];
	}
	
	
}
