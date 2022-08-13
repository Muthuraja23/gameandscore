<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Hockey Goals List</title>
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
					<th>Team</th>
					<th>Name</th>
					<th>Goals Scored</th>
					<th>Time</th>
					<th>Fouls</th>
					<th>Tackles</th>
					<th>Assist</th>
					<th>Goals Attempt</th>
					<th>Penalty</th>
					<th>Corners</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="HSbGoals" items="${allgoals}">
					<tr>
						<td>${HSbGoals.team}</td>
						<td>${HSbGoals.playername}</td>
						<td>${HSbGoals.goalscored}</td>
						<td>${HSbGoals.time}</td>
						<td>${HSbGoals.fouls}</td>
						<td>${HSbGoals.tackles}</td>
						<td>${HSbGoals.assist}</td>
						<td>${HSbGoals.goalsattempt}</td>
						<td>${HSbGoals.penalty}</td>
						<td>${HSbGoals.corners}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>