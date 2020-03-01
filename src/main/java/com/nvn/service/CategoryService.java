package com.nvn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nvn.dao.CategoryDAO;
import com.nvn.entities.Category;

@Service
@Transactional
public class CategoryService implements IService<Category>{

	@Autowired
	private CategoryDAO categoryDAO;
	
	public List<?> getAll() {
		return categoryDAO.getAll();
	}

	public List<?> getAll(String tableName) {
		return null;
	}

	public Category findById(int subjectId, String url) {
		return null;
	}

	public Category findByName(String subname, String name) {
		return null;
	}

	public void insert(Category k) {
		categoryDAO.insert(k);
	}

	public void update(Category k, int subjectId, String url) {
		
	}

	public void delete(String name, String url) {
		
	}

}
