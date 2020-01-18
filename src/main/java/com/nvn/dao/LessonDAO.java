package com.nvn.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nvn.entities.Category;
import com.nvn.entities.CategoryMapper;
import com.nvn.entities.LessonMapper;
import com.nvn.model.Lesson;

@Repository
@Transactional
public class LessonDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Lesson> findAll() {
		String sql = "from lesson";
		Session session = this.sessionFactory.getCurrentSession();
	    return session.createQuery(sql,Lesson.class).getResultList();
	}
	
	public List<com.nvn.model.Category> findAllCategory() {
		String sql = "from category";
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery(sql,com.nvn.model.Category.class).getResultList();
	}
}
