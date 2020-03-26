package com.nvn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nvn.dao.SubjectDAO;
import com.nvn.entities.Subject;

@Service
@Transactional
public class SubjectService implements IService<Subject>{

	@Autowired
	SubjectDAO subjectDAO;
	
	@Override
	public List<?> getAll() {
		return subjectDAO.getAll();
	}

	@Override
	public List<?> getAll(String tableName) {
		return null;
	}

	@Override
	public Subject findById(int subjectId, String url) {
		return null;
	}

	@Override
	public Subject findByName(String subname, String name) {
		return null;
	}

	@Override
	public void insert(Subject k) {
		
	}

	@Override
	public void update(Subject k, int subjectId, String url) {
		
	}

	@Override
	public void delete(String name, String url) {
		
	}

}
