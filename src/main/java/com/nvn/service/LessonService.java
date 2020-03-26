package com.nvn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nvn.dao.LessonDAO;
import com.nvn.entities.Lesson;
//import com.nvn.model.Lesson;

@Service
@Transactional
public class LessonService implements IService<Lesson>{

	@Autowired
	private LessonDAO lessonDAO;
	
	public List<?> getAll(String name) {
		return lessonDAO.getAll(name);
	}

	public Lesson findByName(String name, String url) {
		return lessonDAO.findByName(name, url);
	}

	public Lesson findById(int subjectId, String url) {
		return lessonDAO.findById(subjectId, url);
	}

	public void insert(Lesson lesson) {

		lessonDAO.insert(lesson);
	}

	public void update(Lesson lesson, int subjectId, String url) {
		lessonDAO.update(lesson, subjectId, url);
	}

	public void delete(String name, String url) {
		lessonDAO.delete(name, url);
	}

	public List<Lesson> getAll() {
		return lessonDAO.getAll();
	}
	
}
