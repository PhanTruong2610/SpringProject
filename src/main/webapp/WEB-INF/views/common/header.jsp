<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:include page="../common/lib.jsp" />
<section>
	<div>
		<nav
			class="navbar navbar-expand-lg navbar-dark bg-success fixed-top header">
			<a class="navbar-brand" href="#">Learn Forever</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto justify-content-center item-menu">
					<!-- <li class="nav-item"><a class="nav-link" href="home">Trang
							chủ<span class="sr-only">(current)</span>
					</a></li> -->
					<li class="nav-item" id="c"><a class="nav-link"
						href="c">C/C++</a></li>
					<li class="nav-item" id="html"><a class="nav-link" href="html">HTML</a></li>
					<li class="nav-item" id="css"><a class="nav-link" href="#">CSS</a></li>
					<li class="nav-item" id="javascript"><a class="nav-link" href="#">JavaScript</a>
					</li>
					<li class="nav-item" id="java"><a class="nav-link" href="#">Java</a></li>
					<li class="nav-item" id="python"><a class="nav-link" href="#">Python</a></li>
					<li class="nav-item" id="forum"><a class="nav-link" href="#">Diễn đàn</a></li>
				</ul>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Tìm kiếm" aria-label="Search">
					<button class="btn btn-outline-light my-2 my-sm-0" type="submit">Tìm
						kiếm</button>
				</form>
				<a href="" class="login">Đăng nhập </a>
			</div>
		</nav>
	</div>
</section>