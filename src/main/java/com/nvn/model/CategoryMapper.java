package com.nvn.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategoryMapper implements RowMapper<Category> {

	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category category = new Category();
		category.setCategoryId(rs.getInt("categoryId"));
		category.setCategoryName(rs.getString("categoryName"));
		return category;
	}

}
