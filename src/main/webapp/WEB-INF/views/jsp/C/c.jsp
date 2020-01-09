<!DOCTYPE html>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>Lập trình C/C++</title>
<jsp:include page="../../common/lib.jsp" />
<jsp:include page="../../common/header.jsp" />

<link rel="stylesheet" href="./resources/css/styleC.css">

<div class="container-fluid main" id="col">
	<div class="row">
		<div class="col-2 scroll">
			<!-- slidebar -->
			<ul class="sidebar navbar-nav">
				<li class="nav-item dropdown submenu"><b>Giới thiệu</b> <a
					class="nav-link subcontent" href="c" id="lichsu"
					onclick="c_content();"> Lịch sử </a> <a class="nav-link subcontent"
					href="#" id="caidat" onclick="c_content();"> Cài đặt </a></li>

				<li class="nav-item dropdown submenu"><b>Ngôn ngữ</b> <a
					class="nav-link subcontent" href="#" id="cuphap"
					onclick="c_content()"> Cú pháp </a> <a class="nav-link subcontent"
					href="#" id="nhapxuat" onclick="c_content()"> Nhập/xuất </a> <a
					class="nav-link subcontent" href="#" id="comment"
					onclick="c_content()"> Comment </a> <a class="nav-link subcontent"
					href="#" id="bien" onclick="c_content()"> Biến </a> <a
					class="nav-link subcontent" href="#" id="kieudulieu"
					onclick="c_content()"> Kiểu dữ liệu </a> <a
					class="nav-link subcontent" href="#" id="toantu"
					onclick="c_content()"> Toán tử </a> <a class="nav-link subcontent"
					href="#" id="string" onclick="c_content()"> String </a> <a
					class="nav-link subcontent" href="#" id="math"
					onclick="c_content()"> Math </a> <a class="nav-link subcontent"
					href="#" id="boolean" onclick="c_content()"> Boolean </a> <a
					class="nav-link subcontent" href="#" id="caudieukien"
					onclick="c_content()"> Câu điều kiện </a> <a
					class="nav-link subcontent" href="#" id="switch"
					onclick="c_content()"> Switch </a> <a class="nav-link subcontent"
					href="#" id="for" onclick="c_content()"> Vòng lặp for </a> <a
					class="nav-link subcontent" href="#" id="while"
					onclick="c_content()"> Vòng lặp while </a> <a
					class="nav-link subcontent" href="#" id="break"
					onclick="c_content()"> Break/Continue </a> <a
					class="nav-link subcontent" href="#" id="mang"
					onclick="c_content()"> Mảng </a> <a class="nav-link subcontent"
					href="#" id="contro" onclick="c_content()"> Con trỏ </a></li>

				<li class="nav-item dropdown submenu"><b>Bài tập</b> <a
					class="nav-link subcontent" href="#" id="baitap"
					onclick="c_content()"> Ôn tập </a></li>
			</ul>
			<!-- end slidebar -->
		</div>

		<div class="col-10 ml-auto content">
			<div class="container-fluid">
				<div class="row">
					<div class="col-12" data-spy="scroll" data-target="#list"
						data-offset="0" id="content">
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="../../common/footer.jsp" />

<script type="text/javascript">
	function c_content(){
		
	}
</script>
