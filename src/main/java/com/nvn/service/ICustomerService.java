package com.nvn.service;

import java.util.List;


public interface ICustomerService<K> {
	public List<K> findAll();
	public K findById(int id);
	public void save(K k);
	public void update(K k);
	public void delete(int id);
}
