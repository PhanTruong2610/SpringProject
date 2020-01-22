<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Manage</title>
<jsp:include page="../../common/lib.jsp" />
<link rel="stylesheet" href="./resources/css/styleManage.css">
</head>
<script type="text/javascript">
	var editor = ""
	$(document).ready(function() {
		editor = CKEDITOR.replace('content');
	});
</script>

<%-- <div class="container-fluid">
	<div class="row">
		<div class="col-3">
			<div class="list-group" id="list-tab" role="tablist">
				<a class="list-group-item list-group-item-action active"
					id="list-lesson-list" data-toggle="list" href="#list-lesson"
					role="tab" aria-controls="lesson">Bài viết</a> <a
					class="list-group-item list-group-item-action"
					id="list-category-list" data-toggle="list" href="#list-category"
					role="tab" aria-controls="category">Thể loại</a> <a
					class="list-group-item list-group-item-action"
					id="list-account-list" data-toggle="list" href="#list-account"
					role="tab" aria-controls="account">Tài khoản</a> <a
					class="list-group-item list-group-item-action"
					id="list-members-list" data-toggle="list" href="#list-members"
					role="tab" aria-controls="members">Thành viên</a> <a
					class="list-group-item list-group-item-action" id="list-image-list"
					data-toggle="list" href="#list-image" role="tab"
					aria-controls="image">Hình ảnh</a>
			</div>
		</div>
		<div class="col-9">
			<div class="tab-content" id="nav-tabContent">
				<!-- Tab 1 -->
				<div class="tab-pane fade show active" id="list-lesson"
					role="tabpanel" aria-labelledby="list-lesson-list">
					<form:form action="insert" modelAttribute="lesson" method="POST">
							Tiêu đề: <form:input path="title" />
						<br />
							Hình ảnh: <form:input path="image" />
						<br />
							Nội dung: <form:textarea path="content" id="content" />
						<br />
							SubjectId: <form:input path="subjectId" />
						<br />
							UserId: <form:input path="userId" />
						<br />
							Url: <form:input path="url" />
						<br />

						<input type="submit" name="Click" value="Nút bấm">
					</form:form>
				</div>

				<!-- Tab 2 -->
				<div class="tab-pane fade" id="list-category" role="tabpanel"
					aria-labelledby="list-category-list"></div>

				<!-- Tab 3 -->
				<div class="tab-pane fade" id="list-account" role="tabpanel"
					aria-labelledby="list-account-list"></div>

				<!-- Tab 4 -->
				<div class="tab-pane fade" id="list-members" role="tabpanel"
					aria-labelledby="list-members-list">nguyễn</div>

				<!-- Tab 5 -->
				<div class="tab-pane fade" id="list-image" role="tabpanel"
					aria-labelledby="list-image-list">Trang 5</div>
			</div>
		</div>
	</div>
</div>
 --%>
<div class="container-fluid">
	<div class="row">
		<div class="col-12">
			<form:form action="insert" modelAttribute="lesson" method="POST">
				Tiêu đề: <form:input path="title" value=""/>
				<br />
				Hình ảnh: <form:input path="image" />
				<br />
				Nội dung: <form:textarea path="content" id="content" />
				<br />
				Nội dung ngắn: <form:textarea path="shortContent" id="shortContent" />
				<br />
				SubjectId: <form:input path="id.subjectId" />
				<br />
				UserId: <form:input path="account.userId" />
				<br />
				Url: <form:input path="id.url" />
				<br />
				<input type="submit" name="Load" value="Load">
			</form:form>
		</div>
	</div>
</div>