<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cricket Scoreboard List</title>
<style>
h1, h2, h3 {
	text-align: center;
}

table, th, td {
	border: 2px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>Cr Scoreboard Id</th>
					<th>Game Id</th>
					<th>Match Between</th>
					<th>Team 1</th>
					<th>Overs</th>
					<th>Team 2</th>
					<th>Overs</th>
					<th>Result</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="CrScoreboard" items="${score}">
					<tr>
						<td>${CrScoreboard.crscoreboardid}</td>
						<td>${CrScoreboard.gameid}</td>
						<td>${CrScoreboard.matchbetween}</td>
						<td>${CrScoreboard.team1}</td>
						<td>${CrScoreboard.overs}</td>
						<td>${CrScoreboard.team2}</td>
						<td>${CrScoreboard.overs}</td>
						<td>${CrScoreboard.result}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>