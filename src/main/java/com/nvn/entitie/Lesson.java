package com.nvn.entitie;

public class Lesson {
	String title;
	String image;
	String content;
	String timeCreate;
	int subjectId;
	String fullName;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(String timeCreate) {
		this.timeCreate = timeCreate;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public Lesson() {
		super();
	}

	public Lesson(String title, String image, String content, String timeCreate, int subjectId, String fullName) {
		super();
		this.title = title;
		this.image = image;
		this.content = content;
		this.timeCreate = timeCreate;
		this.subjectId = subjectId;
		this.fullName = fullName;
	}

}
