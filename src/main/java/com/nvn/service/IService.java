package com.nvn.service;

import java.util.List;


public interface IService<K> {
	public List<K> findAll();
	public K findById(int id);
	public void save(K k);
	public void update(K k);
	public void delete(int id);
}
