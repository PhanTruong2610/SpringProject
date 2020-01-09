package com.nvn.entitie;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CMapper implements RowMapper<Lesson> {

	public Lesson mapRow(ResultSet rs, int rowNum) throws SQLException {
		Lesson lesson = new Lesson();
		lesson.setImage(rs.getString("image"));
		lesson.setSubjectId(rs.getInt("subjectId"));
		lesson.setFullName(rs.getString("fullName"));
		lesson.setTimeCreate(rs.getString("timeCreate"));
		lesson.setContent(rs.getString("content"));
		lesson.setTitle(rs.getString("title"));
		return lesson;
	}

}
