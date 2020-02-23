package com.nvn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nvn.entities.Lesson;
//import com.nvn.model.Lesson;
import com.nvn.service.LessonService;


@Controller
public class ManageController {
	@Autowired
	LessonService lessonService;
	
	@RequestMapping(value="/manage", method = RequestMethod.POST)
	public String viewManage(Model model, @ModelAttribute("lesson") Lesson lesson) {
		model.addAttribute("allLesson", lessonService.getAll());
		return "MANAGE/manage";
	}
	
	@RequestMapping(value ="/insert", method = RequestMethod.POST)
	public String insert(Model model, @ModelAttribute("lesson") Lesson lesson) {
		lessonService.insert("",lesson);
		return "MANAGE/manage";
	}
	
	@RequestMapping(value ="/update/{subjectId}/{url}")
	public String update(Model model, @ModelAttribute("lesson") Lesson lesson, @PathVariable int subjectId, @PathVariable String url) {
//		Lesson les=lessonService.getAll().get(0);
		Lesson les=lessonService.findById(subjectId, url);
		model.addAttribute("lesson", les);
//		lessonService.update(lesson, subjectId, url);
		return "MANAGE/update";
	}
	
	@RequestMapping(value ="/update/{subjectId}/{url}/fn")
	public String fnupdate(Model model, @ModelAttribute("lesson") Lesson lesson, @PathVariable int subjectId, @PathVariable String url) {
//		Lesson les=lessonService.getAll().get(0);
		Lesson les=lessonService.findById(subjectId, url);
		model.addAttribute("lesson", les);
		lessonService.update(lesson, subjectId, url);
		model.addAttribute("allLesson", lessonService.getAll());
		return "MANAGE/manage";
	}
	
	@RequestMapping(value ="/delete/{subjectId}/{url}")
	public String delete(Model model, @PathVariable String subjectId, @PathVariable String url) {
		lessonService.delete(subjectId, url);
		model.addAttribute("allLesson", lessonService.getAll());
		return "MANAGE/manage";
	}
}
