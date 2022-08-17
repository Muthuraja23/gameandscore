<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Football ScoreBoard List</title>
<style>
<%@ include file = "css/table.css" %>
</style>
</head>
<body>
	<div id="table root">
		<table class=football>
		<caption></caption>
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
	<div id="table root">
		<table class=fgoals>
		<caption></caption>
			<thead>
				<tr>
					<th>Team1</th>
					<th>Fouls</th>
					<th>Yellow/Red Cards</th>
					<th>Corners</th>
					<th>Saves</th>
					<th>Team2</th>
					<th>Fouls</th>
					<th>Yellow/Red Cards</th>
					<th>Corners</th>
					<th>Saves</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="FbSbGoals" items="${goals}">
					<tr>
						<td>${FbSbGoals.team1}</td>
						<td>${FbSbGoals.t1fouls}</td>
						<td>${FbSbGoals.t1yrcards}</td>
						<td>${FbSbGoals.t1corners}</td>
						<td>${FbSbGoals.t1saves}</td>
						<td>${FbSbGoals.team2}</td>
						<td>${FbSbGoals.t2fouls}</td>
						<td>${FbSbGoals.t2yrcards}</td>
						<td>${FbSbGoals.t2corners}</td>
						<td>${FbSbGoals.t2saves}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>