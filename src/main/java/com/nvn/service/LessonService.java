package com.nvn.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nvn.dao.LessonDAO;
import com.nvn.entities.Category;
import com.nvn.entities.Lesson;
//import com.nvn.model.Category;
//import com.nvn.model.CategoryMapper;
//import com.nvn.model.Lesson;

import com.nvn.model.LessonMapper;

@Service
@Transactional
public class LessonService implements IService<Lesson>{
	
	//jdbc
	/*@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Lesson> findAll(String name) {
		String sql = "select * from lesson join account on lesson.UserId=account.UserId\r\n" + 
				"where lesson.SubjectId=(select SubjectId from subject where SubjectName=?);";
		return jdbcTemplate.query(sql, new LessonMapper(), name);
	}
	
	public List<Category> findAllCategory() {
		String sql = "select * from category";
		return jdbcTemplate.query(sql, new CategoryMapper());
	}

	public Lesson findById(String name, int lessonId) {
		String sql = "SELECT * FROM Lesson join Account on lesson.UserId=account.UserId WHERE lessonId = ? ";
		return jdbcTemplate.queryForObject(sql, new LessonMapper(), lessonId);
	}
	
	public Lesson findByName(String name, String url) {
		String sql = "SELECT * FROM Lesson join Account on lesson.UserId=account.UserId "
				+ "WHERE url = ? and lesson.SubjectId =(select SubjectId from subject where SubjectName=?); ";
		return jdbcTemplate.queryForObject(sql, new LessonMapper(), url, name);
	}
	
	public void insert(String name, Lesson lesson){
		String sql = "INSERT INTO Lesson (Title, Image, Content,ShortContent, SubjectId, UserId, Url) VALUES (?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, lesson.getTitle(), lesson.getImage(), lesson.getContent(),lesson.getShortContent(), lesson.getSubjectId(), lesson.getUserId(), lesson.getUrl());
	}

	public void update(String name, Lesson lesson){
		String sql = "UPDATE Lesson SET name = ?, address = ? WHERE id = ? ";
		jdbcTemplate.update(sql);
	}
	
	public void delete(String name, int id){
		String sql = "DELETE FROM Lesson WHERE id = " + id;
		jdbcTemplate.update(sql);
	}
	*/
	
	//hibernate
	@Autowired
	private LessonDAO lessonDAO;

	public List<Lesson> getAll(String name) {
		return lessonDAO.getAll(name);
	}

	public List<Category> findAllCategory() {
		return lessonDAO.getAllCategory();
	}

	public Lesson findByName(String name, String url) {
		return lessonDAO.findByName(name, url);
	}

	public void insert(String name, Lesson lesson) {

		lessonDAO.insert(lesson);
	}

	public Lesson findById(String name, int id) {
		return null;
	}

	public void update(String name, Lesson lesson) {
		lessonDAO.update(lesson);
	}

	public void delete(String name, int id, Lesson lesson) {
		lessonDAO.delete(lesson);
	}
}
