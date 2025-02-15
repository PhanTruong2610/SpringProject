package com.nvn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import com.nvn.entities.Category;
import com.nvn.entities.Lesson;
import com.nvn.service.CategoryService;
import com.nvn.service.LessonService;
import com.nvn.service.SubjectService;


@Controller
public class ManageController {
	@Autowired
	LessonService lessonService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	SubjectService subjectService;
	
	@RequestMapping(value="/manage", method = RequestMethod.POST)
	public String viewManage(Model model, @ModelAttribute("lesson") Lesson lesson) {
		model.addAttribute("allLesson", lessonService.getAll("java"));
		model.addAttribute("allCategory", categoryService.getAll());
		model.addAttribute("allSubject", subjectService.getAll());
		return "MANAGE/index";
	}
	
	
	@RequestMapping(value="/manage/java", method=RequestMethod.GET)
	@ResponseBody
	public List<Lesson> view() {
//		model.addAttribute("allLesson2", lessonService.getAll("c"));
		return lessonService.getAll();
	}
	
	@RequestMapping(value ="/insert", method = RequestMethod.POST)
	public String insert(Model model, @ModelAttribute("lesson") Lesson lesson) {
		lessonService.insert(lesson);
		model.addAttribute("allLesson", lessonService.getAll());
		return "MANAGE/manage";
	}
	
	@RequestMapping(value ="/update/{subjectId}/{url}")
	public String update(Model model, @ModelAttribute("lesson") Lesson lesson, @PathVariable int subjectId, @PathVariable String url) {
		Lesson les=lessonService.findById(subjectId, url);
		model.addAttribute("lesson", les);
		return "MANAGE/index";
	}
	
	@RequestMapping(value ="/update/{subjectId}/{url}/fn")
	public String fnupdate(Model model, @ModelAttribute("lesson") Lesson lesson, @PathVariable int subjectId, @PathVariable String url) {
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
	
	@RequestMapping(value ="/insertCategory")
	public String insertCategory(Model model, @ModelAttribute("category") Category category) {
		categoryService.insert(category);
		model.addAttribute("allLesson", lessonService.getAll());
		model.addAttribute("allCategory", categoryService.getAll());
		return "MANAGE/manage";
	}
	
	@RequestMapping("/close")
	public String close(Model model) {
		return "redirect:/java";
	}
}
