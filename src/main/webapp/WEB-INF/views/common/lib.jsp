<!DOCTYPE html>
<html lang="en">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<!-- css -->
<!-- Required meta tags -->
<link rel="shortcut icon" href="./resources/img/favicon.ico" />
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<script src="./resources/js/jquery-3.4.1.min.js"></script>
<script src="./resources/js/popper.min.js"></script>
<script src="./resources/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<!-- <link rel="stylesheet" href="./resources/css/style.css"> -->
<link rel="shortcut icon" href="./resources/img/favicon.ico" />
<link
	href="https://fonts.googleapis.com/css?family=Dancing+Script&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Noto+Serif&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Courier+Prime&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Playfair+Display&display=swap"
	rel="stylesheet">
<script src="./resources/js/style.js"></script>
</html>
