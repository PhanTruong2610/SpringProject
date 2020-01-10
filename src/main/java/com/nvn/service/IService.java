package com.nvn.service;

import java.util.List;


public interface IService<K> {
	List<K> findAll(String name);
	K findById(String name, int id);
	K findByName(String subname, String name);
	void insert(String name, K k);
	void update(String name, K k);
	void delete(String name, int id);
}
