<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<!-- set the encoding of your site -->
	<meta charset="utf-8">
	<!-- set the viewport width and initial-scale on mobile devices -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- set the HandheldFriendly -->
	<meta name="HandheldFriendly" content="True">
	<!-- set the description -->
	<meta name="description" content="STUDYLMS HTML Template">
	<!-- set the Keyword -->
	<meta name="keywords" content="">
	<meta name="author" content="STUDYLMS HTML Template">
	<!-- set the page title -->
	<title>STUDYLMS HTML Template</title>
	<!-- include google roboto font cdn link -->
	<link href="https://fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700,700i%7COpen+Sans:300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
	<!-- include the site bootstrap stylesheet -->
	<link rel="stylesheet" href="resources/css/bootstrap.css">
	<!-- include the site stylesheet -->
	<link rel="stylesheet" href="resources/css/plugins.css">
	<!-- include the site stylesheet -->
	<link rel="stylesheet" href="resources/css/colors.css">
	<!-- include the site stylesheet -->
	<link rel="stylesheet" href="resources/style.css">
	<!-- include the site responsive stylesheet -->
	<link rel="stylesheet" href="resources/css/responsive.css">
</head>
<body>
	<!-- main container of all the page elements -->
	<div id="wrapper">
		<!-- header of the page -->
		<header id="page-header">
			<!-- top bar -->
			<div class="top-bar bg-dark text-gray">
				<div class="container">
					<div class="row top-bar-holder">
						<div class="col-xs-9 col">
							<!-- bar links -->
							<ul class="font-lato list-unstyled bar-links">
								<li>
									<a href="tel:+611234567890">
										<strong class="dt element-block text-capitalize hd-phone">Call :</strong>
										<strong class="dd element-block hd-phone">+375(29)665-02-10</strong>
										<i class="fas fa-phone-square hd-up-phone hidden-sm hidden-md hidden-lg"><span class="sr-only">phone</span></i>
									</a>
								</li>
								<li>
									<a href="mailto:&#069;&#120;&#097;&#109;&#112;&#108;&#101;&#064;&#100;&#111;&#109;&#097;&#105;&#110;&#046;&#099;&#111;&#109;">
										<strong class="dt element-block text-capitalize hd-phone">Email : Yudenkovvs@mail.ru</strong>
										<strong class="dd element-block hd-phone"></strong>
										<i class="fas fa-envelope-square hd-up-phone hidden-sm hidden-md hidden-lg"><span class="sr-only">email</span></i>
									</a>
								</li>
							</ul>
						</div>
						<div class="col-xs-3 col justify-end">
							<!-- user links -->
							<ul class="list-unstyled user-links fw-bold font-lato">
								<li><a href="#popup1" class="lightbox">Login</a> <span class="sep">|</span> <a href="#popup2" class="lightbox">Register</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<!-- header holder -->
			<div class="header-holder">
				<div class="container">
					<div class="row">
						<div class="col-xs-6 col-sm-3">
							<!-- logo -->
							<div class="logo">
								<a href="home.html">
									<img src="resources/images/logo-dark.png" alt="studylms">
								</a>
							</div>
						</div>
						<div class="col-xs-6 col-sm-9 static-block">
							<!-- nav -->
							<nav id="nav" class="navbar navbar-default">
								<div class="navbar-header">
									<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
										<span class="sr-only">Toggle navigation</span>
										<span class="icon-bar"></span>
										<span class="icon-bar"></span>
										<span class="icon-bar"></span>
									</button>
								</div>
								<!-- navbar collapse -->
								<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
									<!-- main navigation -->
									<ul class="nav navbar-nav navbar-right main-navigation text-uppercase font-lato">
										<li class="dropdown">
											<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">home</a>
											<ul class="dropdown-menu">
												<li><a href="home.html">Home 1</a></li>
												<li><a href="home2.html">Home 2</a></li>
											</ul>
										</li>
										<li class="dropdown">
											<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Courses</a>
											<ul class="dropdown-menu">
												<li><a href="courses-list.html">Course List</a></li>
												<li><a href="course-single.html">Course Single</a></li>
											</ul>
										</li>
										<li class="dropdown">
											<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Events</a>
											<ul class="dropdown-menu">
												<li><a href="events-list.html">Event List</a></li>
												<li><a href="event-sigle.html">Event Single</a></li>
											</ul>
										</li>
										<li class="dropdown">
											<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Pages</a>
											<ul class="dropdown-menu">
												<li><a href="404.html">404 Page</a></li>
												<li><a href="about-us.html">About us</a></li>
												<li><a href="forum.html">Forum Page</a></li>
												<li><a href="forum-single.html">Forum Single</a></li>
												<li><a href="instructors-list.html">Instructors List</a></li>
												<li><a href="instructor-single.html">Instructors Single</a></li>
												<li><a href="login-regestration.jsp">Login &amp; Register</a></li>
											</ul>
										</li>
										<li class="dropdown">
											<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Blog</a>
											<ul class="dropdown-menu">
												<li><a href="blog.html">Blog List</a></li>
												<li><a href="blog-single.html">Blog Single</a></li>
											</ul>
										</li>
										<li class="dropdown">
											<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Shop</a>
											<ul class="dropdown-menu">
												<li><a href="shop.html">Shop List</a></li>
												<li><a href="single-product.html">Shop Single</a></li>
												<li><a href="cartage.html">Cart Page</a></li>
												<li><a href="checkout.html">Checkout</a></li>
											</ul>
										</li>
										<li><a href="contact.html">coNTACT</a></li>
									</ul>
								</div>
								<!-- navbar form -->
								<form action="#" class="navbar-form navbar-search-form navbar-right">
									<a class="fas fa-search search-opener" role="button" data-toggle="collapse" href="#searchCollapse" aria-expanded="false" aria-controls="searchCollapse"><span class="sr-only">search opener</span></a>
									<!-- search collapse -->
									<div class="collapse search-collapse" id="searchCollapse">
										<div class="form-group">
											<input type="text" class="form-control" placeholder="Search &hellip;">
											<button type="button" class="fas fa-search btn"><span class="sr-only">search</span></button>
										</div>
									</div>
								</form>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</header>
		<!-- contain main informative part of the site -->
		<main id="main">
			<!-- heading banner -->
			<header class="heading-banner text-white bgCover" style="background-image: url(http://placehold.it/1920x181);">
				<div class="container holder">
					<div class="align">
						<h1>My Account</h1>
					</div>
				</div>
			</header>
			<!-- breadcrumb nav -->
			<nav class="breadcrumb-nav">
				<div class="container">
					<!-- breadcrumb -->
					<ol class="breadcrumb">
						<li><a href="home.html">Home</a></li>
						<li class="active">My Account</li>
					</ol>
				</div>
			</nav>
			<!-- user log block -->
			<section class="container user-log-block">
				<div class="row">
					<div class="col-xs-12 col-md-6">
						<!-- user log form -->
						<form action="/login" role="form" method="POST" class="user-log-form">
							<h2>Login Form</h2>
							<div class="form-group">
								<input type="text" class="form-control element-block" id="name" name="name" placeholder="Username or email address *">
							</div>
							<div class="form-group">
								<input type="password" class="form-control element-block" id="pass" name="pass" placeholder="Password *">
							</div>
							<div class="btns-wrap">
								<div class="wrap">
									<label for="rem2" class="custom-check-wrap fw-normal font-lato">
										<input type="checkbox" id="rem2" class="customFormReset">
										<span class="fake-label element-block">Remember me</span>
									</label>
									<button type="submit" class="btn btn-theme btn-warning fw-bold font-lato text-uppercase">Login</button>
								</div>
								<div class="wrap text-right">
									<p>
										<a href="#" class="forget-link">Lost your Password?</a>
									</p>
								</div>
							</div>
						</form>
					</div>
					<div class="col-xs-12 col-md-6">
						<!-- user log form -->
						<form action="/richest" class="user-log-form" method="POST" >
							<h2>Register Form</h2>
							<div class="form-group">
								<input type="email" class="form-control element-block"  name="name" placeholder="Email address *">
							</div>
							<div class="form-group">
								<input type="password" class="form-control element-block"  name="pass" placeholder="Password *">
							</div>
							<div class="form-group">
								<input type="text" class="form-control element-block"  name="nameUser" placeholder=" Your name *">
							</div>
							<div class="form-group">
								<input type="text" class="form-control element-block"  name="surname" placeholder="Your surmane *">
							</div>
							<div class="btns-wrap">
								<div class="wrap">
									<button type="submit" class="btn btn-theme btn-warning fw-bold font-lato text-uppercase">Register</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</section>
		</main>
		<!-- footer area container -->
		<div class="footer-area bg-dark text-gray">

			<!-- page footer -->
			<footer id="page-footer" class="font-lato">
				<div class="container">
					<div class="row holder">
						<div class="col-xs-12 col-sm-push-6 col-sm-6">
							<ul class="socail-networks list-unstyled">
								<li><a href="#"><span class="fab fa-facebook"></span></a></li>
								<li><a href="#"><span class="fab fa-twitter"></span></a></li>
								<li><a href="#"><span class="fab fa-instagram"></span></a></li>
								<li><a href="#"><span class="fab fa-linkedin"></span></a></li>
							</ul>
						</div>
						<div class="col-xs-12 col-sm-pull-6 col-sm-6">
							<p><a href="#">Studylms</a> | &copy; 2018 <a href="#">DesignFalls</a>, All rights reserved</p>
						</div>
					</div>
				</div>
			</footer>
		</div>
		<!-- back top of the page -->
		<span id="back-top" class="text-center fa fa-caret-up"></span>
	</div>
	<div class="popup-holder">
		<div id="popup1" class="lightbox-demo">
			<form action="#" class="user-log-form">
				<h2>Login Form</h2>
				<div class="form-group">
					<input type="text" class="form-control element-block" placeholder="Username or email address *">
				</div>
				<div class="form-group">
					<input type="password" class="form-control element-block" placeholder="Password *">
				</div>
				<div class="btns-wrap">
					<div class="wrap">
						<label for="rem" class="custom-check-wrap fw-normal font-lato">
							<input type="checkbox" id="rem" class="customFormReset">
							<span class="fake-label element-block">Remember me</span>
						</label>
						<button type="submit" class="btn btn-theme btn-warning fw-bold font-lato text-uppercase">Login</button>
					</div>
					<div class="wrap text-right">
						<p>
							<a href="#" class="forget-link">Lost your Password?</a>
						</p>
					</div>
				</div>
			</form>
		</div>
		<div id="popup2" class="lightbox-demo">
			<form action="#" class="user-log-form">
				<h2>Register Form</h2>
				<div class="form-group">
					<input type="email" class="form-control element-block" placeholder="Email address *">
				</div>
				<div class="form-group">
					<input type="password" class="form-control element-block" placeholder="Password *">
				</div>
				<div class="btns-wrap">
					<div class="wrap">
						<button type="submit" class="btn btn-theme btn-warning fw-bold font-lato text-uppercase">Register</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- include jQuery -->
	<script src="resources/js/jquery.js"></script>
	<!-- include jQuery -->
	<script src="resources/js/plugins.js"></script>
	<!-- include jQuery -->
	<script src="resources/js/jquery.main.js"></script>
	<!-- include jQuery -->
	<script type="text/javascript" src="resources/js/init.js"></script>
</body>
</html>