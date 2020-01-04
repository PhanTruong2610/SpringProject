<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<jsp:include page="../common/lib.jsp" />
<header class="header_area">
	<div class="sub_header">
		<div class="container">
			<div class="row align-items-center">
				<div class="col-4 col-md-4 col-xl-6">
					<div id="logo">
						<a href="#"><img src="./resources/img/favicon.png" alt=""
							title="" /></a>
					</div>
				</div>
				<div class="col-8 col-md-8 col-xl-6 ">
					<div class="sub_header_social_icon float-right">
						<a href="#"><i class="flaticon-phone"></i><b>0987654321</b></a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="main_menu">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<nav class="navbar navbar-expand-lg navbar-light">
						<button class="navbar-toggler" type="button"
							data-toggle="collapse" data-target="#navbarSupportedContent"
							aria-controls="navbarSupportedContent" aria-expanded="false"
							aria-label="Toggle navigation">
							<i class="ti-menu"></i>
						</button>

						<div class="collapse navbar-collapse justify-content-center"
							id="navbarSupportedContent">
							<ul class="navbar-nav">
								<li class="nav-item active"><b><a
										class="nav-link active" href="index">Home</a></b></li>
								<li class="nav-item"><b><a href="#" class="nav-link">Employee</a></b>
								</li>
								<li class="nav-item"><b><a href="#" class="nav-link">Attendance</a></b>
								</li>
								<li class="nav-item"><b><a href="#" class="nav-link">Leave</a></b>
								</li>
								<li class="nav-item dropdown"><b><a
										class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
										role="button" data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="false"> More </a></b>
									<div class="dropdown-menu" aria-labelledby="navbarDropdown">
										<b><a class="dropdown-item" href="#">Logout</a></b> <b><a
											class="dropdown-item" href="#">Info</a></b>
									</div></li>
							</ul>
						</div>
					</nav>
				</div>
			</div>
		</div>
	</div>
</header>