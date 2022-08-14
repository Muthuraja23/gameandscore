<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Game List</title>
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
table.center {
	margin-left: auto;
	margin-right: auto;
}

div {
	text-align: center;
}


.content-table {
	border-collapse: collapse;
	margin: 25px 0;
	font-size: 0.9em;
	min-width: 400px;
}

.content-table thead tr {
	background-color: #04AA6D;
	color: white;
	text-align: left;
	font-weight: bold;
}

.content-table th, .content-table td {
	padding: 12px 15px;
}

.content-table tbody tr {
	border-bottom: 1px solid #dddddd;
}

.content-table tbody tr:nth-of-type(even){
	background-color: #f3f3f3;
}
.content-table tbody tr:last-of-type{
	border-bottom: 2px solid #04AA6D;
}

</style>
</head>
<body>
	<ul class="topnav">
		<li><a class="active" href="/game/index">Home</a></li>
		<li><a href="/game/getallgames">Cricket</a></li>
		<li><a href="/football/getscore">Football</a></li>
		<li><a href="/hockey/getscore">Hockey</a></li>
		<li class="right"><a href="/team/getallteams">Menu</a></li>
	</ul>
	<div style="padding: 0 16px;"></div>
	<div id="table root">
		<table class=content-table>
			<thead>
				<tr>
					<th>Game</th>
					<th>Date And Time</th>
					<th>Result</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Game" items="${allgames}">
					<tr>
						<td>${Game.gamebetween}</td>
						<td>${Game.dateandtime}</td>
						<td><a href="/cricket/getscore">${Game.result}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>