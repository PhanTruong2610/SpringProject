package com.nvn.entitie;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LessonMapper implements RowMapper<Lesson> {

	public Lesson mapRow(ResultSet rs, int rowNum) throws SQLException {
		Lesson lesson = new Lesson();
		lesson.setLessonId(rs.getInt("lessonId"));
		lesson.setImage(rs.getString("image"));
		lesson.setSubjectId(rs.getInt("subjectId"));
		lesson.setFullName(rs.getString("fullName"));
		lesson.setTimeCreate(rs.getString("timeCreate"));
		lesson.setTimeCreate(rs.getString("timeUpdate"));
		lesson.setContent(rs.getString("content"));
		lesson.setTitle(rs.getString("title"));
		lesson.setUrl(rs.getString("url"));
		
		return lesson;
	}

}
