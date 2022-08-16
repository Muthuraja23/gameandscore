<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Game List</title>
<style>
<%@ include file="css/navigationbar.css"%>
<%@ include file="css/table.css"%>
</style>
</head>
<body>
	<ul class="topnav">
		<li><a class="active" href="/game/index">Home</a></li>
		<li><a href="/game/getallgames?id=1">Cricket</a></li>
		<li><a href="/game/getallgames?id=2">Football</a></li>
		<li><a href="/game/getallgames?id=3">Hockey</a></li>
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
						<td><a href="/cricket/getscore?id=${Game.gameid}">${Game.result}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>