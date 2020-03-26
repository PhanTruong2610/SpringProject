package com.nvn.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nvn.entities.Subject;

@Repository
@Transactional
public class SubjectDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	Session session=null;
	
	public List<?> getAll() {
		if (session==null) session = this.sessionFactory.openSession();
		CriteriaQuery<Subject> cq = session.getCriteriaBuilder().createQuery(Subject.class);
		cq.from(Subject.class);
		return session.createQuery(cq).getResultList();
	}

}
