<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Hockey ScoreBoard List</title>
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
				<c:forEach var="HockeyScoreboard" items="${score}">
					<tr>
						<td>${HockeyScoreboard.matchbetween}</td>
						<td>${HockeyScoreboard.team1score}</td>
						<td>${HockeyScoreboard.team2score}</td>
						<td>${HockeyScoreboard.result}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>