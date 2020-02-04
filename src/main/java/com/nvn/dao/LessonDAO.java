package com.nvn.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nvn.entities.Account;
import com.nvn.entities.Category;
import com.nvn.entities.Lesson;
import com.nvn.entities.Subject;

@Repository
@Transactional
public class LessonDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Lesson> getAll(String name) {
		Session session = this.sessionFactory.openSession();
	    String sql = "from Lesson les where les.subject.subjectId=(select subjectId from Subject sub where sub.subjectName='"+name+"')";
	    List<Lesson> result = session.createQuery(sql, Lesson.class).getResultList();
	    return result;
	}
	
	public List<Category> getAllCategory() {
		Session session = this.sessionFactory.openSession();
		return session.createQuery("FROM Category", Category.class).getResultList();
	}
	
	public Lesson findByName(String name, String url) {
		String sql = "FROM Lesson les WHERE url = '"+ url +"' and les.subject.subjectId=(select subjectId from Subject sub where sub.subjectName='"+name+"')";
		Session session = this.sessionFactory.openSession();
		List<Lesson> result = session.createQuery(sql, Lesson.class).getResultList();
		return result.get(0);
	}
	
	public Subject getSubject() {
		String sql = "FROM Subject";
		Session session = this.sessionFactory.openSession();
		List<Subject> result = session.createQuery(sql, Subject.class).getResultList();
		return result.get(0);
	}
	
	public List<Account> findAllAccount(Session session, int userId) {
		return session.createQuery("FROM Account acc where acc.userId= "+userId+"", Account.class).getResultList();
	}
	
	public List<Subject> findAllSubject(Session session, int subjectId) {
		return session.createQuery("FROM Subject sub where sub.subjectId="+subjectId+"", Subject.class).getResultList();
	}
	
	public void insert(Lesson lesson) {
		Session session = this.sessionFactory.openSession();
		Transaction tx1 = session.beginTransaction();
		lesson.setAccount(findAllAccount(session, 1).get(0));
		session.save(lesson);
		tx1.commit();
		session.close();
	}
	
	public void update(Lesson lesson) {
		Session session = this.sessionFactory.openSession();
		Transaction tx1 = session.beginTransaction();
		lesson.setAccount(findAllAccount(session, 1).get(0));
		session.save(lesson);
		tx1.commit();
		session.close();
	}
	
	public void delete(Lesson lesson) {
		Session session = this.sessionFactory.openSession();
		String sql = "delete Lesson les where les.title='lich su'";
		Transaction t = session.beginTransaction();
		Query<?> query =  session.createQuery(sql);
        query.executeUpdate();
        t.commit();
        session.close();
	}
}
