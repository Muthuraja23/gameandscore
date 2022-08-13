<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<style>
* {
	text-align: center;
}

body {
	margin: 0;
}

ul.topnav {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

ul.topnav li {
	float: left;
}

ul.topnav li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

ul.topnav li a:hover:not(.active) {
	background-color: #111;
}

ul.topnav li a.active {
	background-color: #04AA6D;
}

ul.topnav li.right {
	float: right;
}

@media screen and (max-width: 600px) {
	ul.topnav li.right, ul.topnav li {
		float: none;
	}
}
</style>
</head>
<body>

	<div class="container">
		<h1  style="background-color: ">ScoreBoard</h1>
		<ul class="topnav">
			<li><a class="active" href="/game/index">Home</a></li>
			<li><a href="/game/getallgames">Cricket</a></li>
			<li><a href="/football/getscore">Football</a></li>
			<li><a href="/hockey/getscore">Hockey</a></li>
			<li class="right"><a href="/team/getallteams">Menu</a></li>
		</ul>
		<div style="padding: 0 16px;"></div>
	</div>
</body>
</html>