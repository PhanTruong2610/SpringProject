package com.nvn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nvn.entitie.CMapper;
import com.nvn.entitie.HTMLMapper;
import com.nvn.entitie.Lesson;

@Service
@Transactional
public class HTMLService implements IService<Lesson>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Lesson> findAll() {
		String sql = "select lesson.Title,account.FullName,lesson.TimeCreate,lesson.Image,lesson.Content,lesson.SubjectId\r\n" + 
				"from lesson join account \r\n" + 
				"where lesson.UserId=account.UserId;";
		return jdbcTemplate.query(sql, new HTMLMapper());
	}

	public Lesson findById(int id) {
		return null;
	}

	public void save(Lesson k) {
		
	}

	public void update(Lesson k) {
		
	}

	public void delete(int id) {
		
	}

}
