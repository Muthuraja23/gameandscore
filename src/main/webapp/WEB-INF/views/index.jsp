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
<%@include file="css/navigationbar.css"%>
<%@include file="css/slider.css"%>
<%@include file="css/footer.css"%>
img{
opacity: 0.75;
}
</style>
</head>
<body>
<div class="container">
		<ul class="topnav">
			<li><a class="active" href="/game/index">Home</a></li>
			<li><a href="/game/getallgames?id=1">Cricket</a></li>
			<li><a href="/game/getallgames?id=2">Football</a></li>
			<li><a href="/game/getallgames?id=3">Hockey</a></li>
			<li class="right"><a href="/login">Admin</a></li>
			<li class="right"><a href="/team/getallteams">Teams</a></li>
		</ul>
		<div style="padding: 0 16px;"></div>
	</div>
	<form:form action="" method="get" modelAttribute="space">
		<div class="w3-content-width w3-sections">
			<img class="mySlides" src="https://media.istockphoto.com/photos/cricket-leather-ball-resting-on-bat-on-the-stadium-pitch-picture-id1255328634?b=1&k=20&m=1255328634&s=170667a&w=0&h=kPODQbM_ZecfQOPipjG-iTfyvDwrlx6CQwECg2iGvQg=" alt="" style="width: 100%">
			<img class="mySlides" src="https://images.pexels.com/photos/46798/the-ball-stadion-football-the-pitch-46798.jpeg" alt="" style="width: 100%"> 
			<img class="mySlides" src="https://wallpaperaccess.com/full/2051794.jpg" alt="" style="width: 100%">
		</div>
	</form:form>
	<script>
		var myIndex = 0;
		carousel();
		function carousel() {
			var i;
			var x = document.getElementsByClassName("mySlides");
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			myIndex++;
			if (myIndex > x.length) {
				myIndex = 1
			}
			x[myIndex - 1].style.display = "block";
			setTimeout(carousel, 5000); // Change image every 5 seconds
		}
	</script>
	<footer class=footer>
	  <p>&#169 2022 buzzbuzz.com, Times Internet Limited.All rights reserved | The Days of India | Bharat Times</p>
	</footer>
</body>
</html>