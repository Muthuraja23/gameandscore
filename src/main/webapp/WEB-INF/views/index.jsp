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
<%@ include file="css/navigationbar.css"%>
</style>
</head>
<body>
	<div class="container">
		<ul class="topnav">
			<li><a class="active" href="/game/index">Home</a></li>
			<li><a href="/game/getallgames?id=1">Cricket</a></li>
			<li><a href="/game/getallgames?id=2">Football</a></li>
			<li><a href="/game/getallgames?id=3">Hockey</a></li>
			<li class="right"><a href="/team/getallteams">Menu</a></li>
		</ul>
		<div style="padding: 0 16px;"></div>
	</div>
</body>
</html>