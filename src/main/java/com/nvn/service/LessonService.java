package com.nvn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nvn.entitie.Lesson;
import com.nvn.entitie.LessonMapper;

@Service
@Transactional
public class LessonService implements IService<Lesson>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Lesson> findAll(String name) {
		String sql = "select * from lesson join account on lesson.UserId=account.UserId\r\n" + 
				"where lesson.SubjectId=(select SubjectId from subject where SubjectName=?);";
		return jdbcTemplate.query(sql, new LessonMapper(), name);
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
		String sql = "INSERT INTO Lesson (Title, Image, Content, SubjectId, UserId) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, lesson.getTitle(), lesson.getImage(), lesson.getContent(), lesson.getSubjectId(), lesson.getUserId());
	}

	public void update(String name, Lesson lesson){
		String sql = "UPDATE Lesson SET name = ?, address = ? WHERE id = ? ";
		jdbcTemplate.update(sql);
	}
	
	public void delete(String name, int id){
		String sql = "DELETE FROM Lesson WHERE id = " + id;
		jdbcTemplate.update(sql);
	}
}
