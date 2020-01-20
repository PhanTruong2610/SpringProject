package com.nvn.model;

public class Lesson {
	int subjectId;
	int userId;
	String title;
	String image;
	String content;
	String shortContent;
	String timeCreate;
	String timeUpdate;
	String fullName;
	String view;
	String url;

	public String getShortContent() {
		return shortContent;
	}

	public void setShortContent(String shortContent) {
		this.shortContent = shortContent;
	}

	public String getTimeUpdate() {
		return timeUpdate;
	}

	public void setTimeUpdate(String timeUpdate) {
		this.timeUpdate = timeUpdate;
	}

	public String getView() {
		return view;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setView(String view) {
		this.view = view;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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

	public Lesson(String title, String image, String content, String timeCreate, int subjectId,
			String fullName, String url) {
		super();
		this.title = title;
		this.image = image;
		this.content = content;
		this.timeCreate = timeCreate;
		this.subjectId = subjectId;
		this.fullName = fullName;
		this.url = url;
	}

	public Lesson(String title, String image, String content, int subjectId, String fullName) {
		super();
		this.title = title;
		this.image = image;
		this.content = content;
		this.subjectId = subjectId;
		this.fullName = fullName;
	}

	public Lesson(int subjectId, int userId, String title, String image, String content, String url) {
		super();
		this.subjectId = subjectId;
		this.userId = userId;
		this.title = title;
		this.image = image;
		this.content = content;
		this.url = url;
	}

}
