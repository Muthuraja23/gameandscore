<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Batting 3 Score</title>
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
		<table class="center">
			<thead>
				<tr>
					<th>Team</th>
					<th>Name</th>
					<th>Runs Scored</th>
					<th>Balls Faced</th>
					<th>Fours</th>
					<th>Sixes</th>
					<th>Strike Rate</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Batting3" items="${batting3details}">
					<tr>
						<td>${Batting3.team}</td>
						<td>${Batting3.playername}</td>
						<td>${Batting3.runsscored}</td>
						<td>${Batting3.ballsfaced}</td>
						<td>${Batting3.fours}</td>
						<td>${Batting3.sixes}</td>
						<td>${Batting3.strikerate}</td>
						<td>${Batting3.status}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>