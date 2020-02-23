package com.nvn.service;

import java.util.List;


public interface IService<K> {
	List<K> getAll();
	List<K> getAll(String name);
	K findById(int subjectId, String url);
	K findByName(String subname, String name);
	void insert(String name, K k);
	void update(K k, int subjectId, String url);
	void delete(String name, String url);
}
