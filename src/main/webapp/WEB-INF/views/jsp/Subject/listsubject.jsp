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

<script>
	$('#${url}').addClass('active');
</script>

<!-- <script type="text/javascript">
	$(document).ready(function(){
		$('#title').click(function(){
			$.ajax({
				type:'GET',
				url:'html/gioi-thieu',
				success:function(result){
					$('#contentchild').html(result);
				}
			});
		});
	});
</script> -->

<div class="container main">
	<div class="row">
		<div class="col-9">
			<div class="container-fluid">
				<c:if test="${not empty listLesson}">
					<c:forEach var="index" items="${listLesson}">
						<div class="row rows">
							<div class="col-3">
								<img src="${index.image}" class="img">
							</div>
							<div class="col-9">
								<a href="${url}/${index.url}" class="title">${index.title}</a>
								<div class="shortcontent">${index.content}</div>
								<div class="personpost">Đăng bởi: ${index.fullName}. Thời
									gian: ${index.timeCreate}</div>
							</div>
						</div>
					</c:forEach>
				</c:if>
				
				${lesson.content}
				
			</div>
		</div>

		<div class="col-3">
			<c:forEach var="index" items="${listLesson}">
				<a href="${url}/${index.url}">${index.title}</a>
				<br />
			</c:forEach>
		</div>
	</div>
</div>