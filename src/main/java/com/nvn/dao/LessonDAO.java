package com.nvn.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nvn.entities.*;
//import com.nvn.model.*;

@Repository
@Transactional
public class LessonDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Lesson> findAll(String name) {
		Session session = this.sessionFactory.openSession();
	    String sql = "from Lesson les where les.subject.subjectId=(select subjectId from Subject sub where sub.subjectName='"+name+"')";
	    List<Lesson> result = session.createQuery(sql, Lesson.class).getResultList();
	    return result;
	}
	
	public List<Category> findAllCategory() {
		Session session = this.sessionFactory.openSession();
		return session.createQuery("FROM Category", Category.class).getResultList();
	}
	
	public Lesson findByName(String name, String url) {
		String sql = "FROM Lesson les WHERE url = '"+ url +"' and les.subject.subjectId=(select subjectId from Subject sub where sub.subjectName='"+name+"')";
		Session session = this.sessionFactory.openSession();
		List<Lesson> result = session.createQuery(sql, Lesson.class).getResultList();
		return result.get(0);
	}
	
	public Account getAccount() {
		String sql = "FROM Account";
		Session session = this.sessionFactory.openSession();
		List<Account> result = session.createQuery(sql, Account.class).getResultList();
		return result.get(0);
	}
	
	public Subject getSubject() {
		String sql = "FROM Subject";
		Session session = this.sessionFactory.openSession();
		List<Subject> result = session.createQuery(sql, Subject.class).getResultList();
		return result.get(0);
	}
	
	public void insert(Lesson lesson) {
		Session session = this.sessionFactory.openSession();
//		session.beginTransaction();
		session.save(lesson);
//		session.getTransaction().commit();
//		session.close();
//		sessionFactory.close();
	}
}
