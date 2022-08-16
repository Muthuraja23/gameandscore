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
					<th>Team 1</th>
					<th>Period 1</th>
					<th>Period 2</th>
					<th>Period 3</th>
					<th>OT</th>
					<th>Total</th>
					<th>Team 2</th>
					<th>Period 1</th>
					<th>Period 2</th>
					<th>Period 3</th>
					<th>OT</th>
					<th>Total</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="HockeyScoreboard" items="${score}">
					<tr>
						<td>${HockeyScoreboard.team1}</td>
						<td>${HockeyScoreboard.t1period1}</td>
						<td>${HockeyScoreboard.t1period2}</td>
						<td>${HockeyScoreboard.t1period3}</td>
						<td>${HockeyScoreboard.t1ot}</td>
						<td>${HockeyScoreboard.t1total}</td>
						<td>${HockeyScoreboard.team2}</td>
						<td>${HockeyScoreboard.t2period1}</td>
						<td>${HockeyScoreboard.t2period2}</td>
						<td>${HockeyScoreboard.t2period3}</td>
						<td>${HockeyScoreboard.t2ot}</td>
						<td>${HockeyScoreboard.t2total}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>