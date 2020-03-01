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

import com.nvn.entities.Category;

@Repository
@Transactional
public class CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	Session session=null;
	
	public List<Category> getAll() {
		if (session==null) session = this.sessionFactory.openSession();
		CriteriaQuery<Category> cq = session.getCriteriaBuilder().createQuery(Category.class);
		cq.from(Category.class);
		return session.createQuery(cq).getResultList();
	}
	
	
	public Category findById(String id) {
		if (session==null) session = this.sessionFactory.openSession();
		Query<?> query = session.createQuery("FROM Category cat where cat.categoryId=:id", Category.class);
		query.setParameter("name", id);
		return (Category) query.getResultList().get(0);
	}


	public void insert(Category category) {
		Session session = this.sessionFactory.openSession();
		Transaction tx1 = session.beginTransaction();
		session.save(category);
		tx1.commit();
		session.close();
	}
}
