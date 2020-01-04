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
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Home</title>
<link rel="icon" href="./resources/img/favicon.png">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<!-- animate CSS -->
<link rel="stylesheet" href="./resources/css/animate.css">
<!-- owl carousel CSS -->
<link rel="stylesheet" href="./resources/css/owl.carousel.min.css">
<!-- themify CSS -->
<link rel="stylesheet" href="./resources/css/themify-icons.css">
<!-- flaticon CSS -->
<link rel="stylesheet" href="./resources/css/flaticon.css">
<!-- font awesome CSS -->
<link rel="stylesheet" href="./resources/css/magnific-popup.css">
<!-- style CSS -->
<link rel="stylesheet" href="./resources/css/style.css">


<!-- script -->
<!-- jquery -->
<script src="./resources/js/jquery-1.12.1.min.js"></script>
<!-- popper js -->
<script src="./resources/js/popper.min.js"></script>
<!-- bootstrap js -->
<script src="./resources/js/bootstrap.min.js"></script>
<!-- counterup js -->
<script src="./resources/js/jquery.counterup.min.js"></script>
<!-- waypoints js -->
<script src="./resources/js/waypoints.min.js"></script>
<!-- easing js -->
<script src="./resources/js/jquery.magnific-popup.js"></script>
<!-- particles js -->
<script src="./resources/js/owl.carousel.min.js"></script>
<!-- custom js -->
<script src="./resources/js/custom.js"></script>
</html>
