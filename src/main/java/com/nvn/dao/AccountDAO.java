package com.nvn.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nvn.entities.Account;

@Repository
@Transactional
public class AccountDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	Session session=null;
	
	public List<Account> getAll() {
		if (session==null) session = this.sessionFactory.openSession();
		return session.createQuery("FROM Account", Account.class).getResultList();
	}
	
	public Account findById(int userId) {
		if (session==null) session = this.sessionFactory.openSession();
		return session.createQuery("FROM Account acc where acc.userId= "+userId+"", Account.class).getSingleResult();
	}
}
