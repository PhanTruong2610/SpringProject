<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HTML</title>
<jsp:include page="../../common/lib.jsp" />
<jsp:include page="../../common/header.jsp" />
<link rel="stylesheet" href="./resources/css/styleHTML.css">

<div class="container main">
	<div class="row">
		<div class="col-9">
			<div class="container-fluid">
				<c:if test="${not empty listHTML}">
					<c:forEach var="lesson" items="${listHTML}">
						<div class="row rows">
							<div class="col-3">
								<img src="${lesson.image}" class="img">
							</div>
							<div class="col-9">
								<a href="#">${lesson.title}</a>
								<div>${lesson.timeCreate}</div>
								<div>${lesson.content}</div>
								<div class="personpost">${lesson.fullName}</div>
							</div>
						</div>
					</c:forEach>
				</c:if>
			</div>
		</div>

		<div class="col-3" style="border: 1px solid; height: 600px;">
			<a href="#">các thông tin khác</a><br /> <a href="#">đăng ký
				thành viên</a><br /> <a href="#">có thể bạn chưa biết?</a><br /> <a
				href="#">bài viết mới nhất</a><br /> <a href="#">.................</a><br />
		</div>
	</div>
</div>