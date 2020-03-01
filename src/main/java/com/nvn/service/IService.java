package com.nvn.service;

import java.util.List;


public interface IService<K> {
	List<?> getAll();
	List<?> getAll(String tableName);
	K findById(int subjectId, String url);
	K findByName(String subname, String name);
	void insert(K k);
	void update(K k, int subjectId, String url);
	void delete(String name, String url);
}
