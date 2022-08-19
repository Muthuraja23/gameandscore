<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Team List</title>
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
		<li><a href="/game/getallgames?id=1">Cricket</a></li>
			<li><a href="/game/getallgames?id=2">Football</a></li>
			<li><a href="/game/getallgames?id=3">Hockey</a></li>
		<li class="right"><a href="/team/getallteams">Teams</a></li>
	</ul>
	<div style="padding: 0 16px;"></div>

	<div id="table root">
		<table class=content-table>
		<caption></caption>
			<thead>
				<tr>
					<th>Team Name</th>
					<th>Start Date</th>
					<th>Country</th>
					<th>Status</th>
					<th>Owner</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Team" items="${allteams}">
					<tr>
						<td>${Team.teamname}</td>
						<td>${Team.startdate}</td>
						<td>${Team.country}</td>
						<td>${Team.status}</td>
						<td>${Team.owner}</td>
						<td>${Team.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>