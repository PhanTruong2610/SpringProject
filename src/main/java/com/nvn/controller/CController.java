package com.nvn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.nvn.entities.Lesson;
import com.nvn.service.LessonService;

@Controller
public class CController {

	@Autowired
	private LessonService lessonService;

	@RequestMapping("/c")
	public String getLesson(Model model) {
		UriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentRequest();
		String context = builder.buildAndExpand().getPath();
		String[] list = context.split("/");

		model.addAttribute("listLesson", lessonService.findAll("c/c++"));
		model.addAttribute("url", list[list.length - 1]);
		return "Subject/listsubject";
	}

	@RequestMapping("/c/{url}")
	public String viewLessonByUrl(@PathVariable String url, Model model) {
		Lesson lesson = lessonService.findByName("c/c++", url);
		model.addAttribute("lesson", lesson);
		return "Subject/listsubject";
	}

}
