<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Football Goals List</title>
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
					<th>Fb Goals Id</th>
					<th>Game Id</th>
					<th>Team</th>
					<th>Player Name</th>
					<th>Goals Scored</th>
					<th>Time</th>
					<th>Fouls</th>
					<th>Tackles</th>
					<th>Assist</th>
					<th>Goal Attempts</th>
					<th>Penalty</th>
					<th>Corners</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="FbSbGoals" items="${allgoals}">
					<tr>
						<td>${FbSbGoals.fbgoalsid}</td>
						<td>${FbSbGoals.gameid}</td>
						<td>${FbSbGoals.team}</td>
						<td>${FbSbGoals.playername}</td>
						<td>${FbSbGoals.goalscored}</td>
						<td>${FbSbGoals.time}</td>
						<td>${FbSbGoals.fouls}</td>
						<td>${FbSbGoals.tackles}</td>
						<td>${FbSbGoals.assist}</td>
						<td>${FbSbGoals.goalattempt}</td>
						<td>${FbSbGoals.penalty}</td>
						<td>${FbSbGoals.corners}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>