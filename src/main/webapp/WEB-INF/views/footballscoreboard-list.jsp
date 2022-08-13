<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Football Scoreboard List</title>
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
					<th>Match</th>
					<th>Team 1 Score</th>
					<th>Team 2 Score</th>
					<th>Result</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="FootballScoreboard" items="${score}">
					<tr>
						<td>${FootballScoreboard.matchbetween}</td>
						<td>${FootballScoreboard.team1score}</td>
						<td>${FootballScoreboard.team2score}</td>
						<td>${FootballScoreboard.result}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>