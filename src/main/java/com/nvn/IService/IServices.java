package com.nvn.IService;

import java.util.List;


public interface IServices<K> {
	public List<K> findAll();
	public K findById(int id);
	public void save(K k);
	public void update(K k);
	public void delete(int id);
}
