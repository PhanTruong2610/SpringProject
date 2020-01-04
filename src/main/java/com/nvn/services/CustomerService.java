package com.nvn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nvn.IService.IServices;
import com.nvn.entities.Customer;
import com.nvn.entities.CustomerMapper;

@Service
@Transactional
public class CustomerService implements IServices<Customer>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Customer> findAll() {
		String sql = "SELECT * FROM customer";
		return jdbcTemplate.query(sql, new CustomerMapper());
	}

	public Customer findById(int id) {
		String sql = "SELECT * FROM customer WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new CustomerMapper(), id);
	}
	
	public void save(Customer customer){
		String sql = "INSERT INTO customer (name, address) VALUES (?, ?)";
		jdbcTemplate.update(sql, customer.getName(), customer.getAddress());
	}

	public void update(Customer customer){
		String sql = "UPDATE customer SET name = ?, address = ? WHERE id = ? ";
		jdbcTemplate.update(sql, customer.getName(), customer.getAddress(), customer.getId());
	}
	
	public void delete(int id){
		String sql = "DELETE FROM customer WHERE id = " + id;
		jdbcTemplate.update(sql);
	}
}
