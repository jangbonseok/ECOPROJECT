<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Eco_Mannger</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<a class="navbar-brand" href="/test/jsp"> <img src="bird.jpg"
			alt="Eco_Mannger logo" style="width: 60px;">
		</a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#">Link1</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link2</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link3</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link4</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link5</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<div class="container">

		<ul class="nav nav-tabs">
			<li class="nav-item"><a class="nav-link active"
				data-toggle="tab" href="#home">Notice</a></li>
			<li class="nav-item"><a class="nav-link" data-toggle="tab"
				href="#menu1">Article</a></li>
			<li class="nav-item"><a class="nav-link" data-toggle="tab"
				href="#menu2">Video</a></li>
			<li class="nav-item"><a class="nav-link" data-toggle="tab"
				href="#menu3">Etc</a></li>
		</ul>

		<div class="tab-content">
			<div class="tab-pane container active" id="home">Notice_Contents</div>
			<div class="tab-pane container fade" id="menu1">news links</div>
			<div class="tab-pane container fade" id="menu2">video links</div>
			<div class="tab-pane container fade" id="menu3">ETC...</div>
		</div>

		<br> <br>
	</div>
	<div class="container">
		<div class="card m-3">
			<div class="card-body">
				<img class="card-img-top" src="img_avatar1.png"
					alt="Eco_Challenge Img" style="width: 60px;"> <a href="#"
					class="btn card-title m-1" style="font-size: 20px;">Content_Name</a>
			</div>
			<a href="#" class="btn btn-primary" style="margin-left:15%; margin-right:15%">View Content</a>
		</div>

		<div class="card m-3">
			<div class="card-body">
				<img class="card-img-top" src="img_avatar1.png"
					alt="Eco_Challenge Img" style="width: 60px;"> <a href="#"
					class="btn card-title m-1" style="font-size: 20px;">Content_Name</a>
			</div>
			
			<a href="#" class="btn btn-primary" style="margin-left:15%; margin-right:15%">View Content</a>
			
		</div>

		<div class="card m-3">
			<div class="card-body">
				<img class="card-img-top" src="img_avatar1.png"
					alt="Eco_Challenge Img" style="width: 60px;"> <a href="#"
					class="btn card-title m-1" style="font-size: 20px;">Content_Name</a>
			</div>
			
			<a href="#" class="btn btn-primary" style="margin-left:15%; margin-right:15%">View Content</a>
			
		</div>

		<div class="card m-3">
			<div class="card-body">
				<img class="card-img-top" src="img_avatar1.png"
					alt="Eco_Challenge Img" style="width: 60px;"> <a href="#"
					class="btn card-title m-1" style="font-size: 20px;">Content_Name</a>
			</div>
			
			<a href="#" class="btn btn-primary" style="margin-left:15%; margin-right:15%">View Content</a>
			
		</div>

		<div class="card m-3">
			<div class="card-body">
				<img class="card-img-top" src="img_avatar1.png"
					alt="Eco_Challenge Img" style="width: 60px;"> <a href="#"
					class="btn card-title m-1" style="font-size: 20px;">Content_Name</a>
			</div>
			
		<a href="#" class="btn btn-primary" style="margin-left:15%; margin-right:15%">View Content</a>
			
		</div>
	</div>


	<div class="jumbotron text-center" style="margin-bottom: 0">
		<p>Footer</p>
	</div>




</body>
</html>


