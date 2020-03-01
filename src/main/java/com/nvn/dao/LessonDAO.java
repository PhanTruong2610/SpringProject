package com.nvn.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
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
public class LessonDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private AccountDAO accountDAO;
	
	Session session=null;
	
	public List<Lesson> getAll() {
		if (session==null) session = this.sessionFactory.openSession();
		CriteriaQuery<Lesson> cq = session.getCriteriaBuilder().createQuery(Lesson.class);
		cq.from(Lesson.class);
		return session.createQuery(cq).getResultList();
	}
	
	public List<?> getAll(String name) {
		if (session==null) session = this.sessionFactory.openSession();
	    String sql = "from Lesson les where les.subject.subjectId=(select subjectId from Subject sub where sub.subjectName=:name)";
	    Query<?> query = session.createQuery(sql, Lesson.class);
	    query.setParameter("name", name);
	    List<?> result = query.getResultList();
	    return result;
	}
	
	public Lesson findByName(String name, String url) {
		String sql = "FROM Lesson les WHERE url = :url and les.subject.subjectId=(select subjectId from Subject sub where sub.subjectName=:name)";
		if (session==null) session = this.sessionFactory.openSession();
		Query<?> query = session.createQuery(sql, Lesson.class);
		query.setParameter("url", url);
		query.setParameter("name", name);
		return (Lesson) query.getSingleResult();
	}
	
	public Subject getSubject() {
		String sql = "FROM Subject";
		if (session==null) session = this.sessionFactory.openSession();
		return session.createQuery(sql, Subject.class).getSingleResult();
	}
	
	public Account findAllAccount(Session session, int userId) {
		return session.createQuery("FROM Account acc where acc.userId= "+userId+"", Account.class).getSingleResult();
	}
	
	public Subject findAllSubject(Session session, int subjectId) {
		return session.createQuery("FROM Subject sub where sub.subjectId="+subjectId+"", Subject.class).getSingleResult();
	}
	
	public void insert(Lesson lesson) {
		Session session = this.sessionFactory.openSession();
		Transaction tx1 = session.beginTransaction();
		lesson.setAccount(findAllAccount(session, 1));
		session.save(lesson);
		tx1.commit();
		session.close();
	}
	
	public void update(Lesson lesson, int subjectId, String url) {
		Session session = this.sessionFactory.openSession();
		Transaction tx1 = session.beginTransaction();
		lesson.setAccount(findAllAccount(session, 1));
		session.update(lesson);
		tx1.commit();
		session.close();
	}
	
	public void delete(String subjectId, String url) {
		Session session = this.sessionFactory.openSession();
		String sql = "delete Lesson les where les.id.subjectId='"+subjectId+"' and les.id.url='"+url+"'";
		Transaction t = session.beginTransaction();
		Query<?> query =  session.createQuery(sql);
        query.executeUpdate();
        t.commit();
        session.close();
	}
	
	public Lesson findById(int subjectId, String url) {
		if (session==null) session = this.sessionFactory.openSession();
	    String sql = "from Lesson les where les.id.subjectId="+subjectId+" and les.id.url='"+url+"'";
	    List<Lesson> result = session.createQuery(sql, Lesson.class).getResultList();
		return result.get(0);
	}
}
