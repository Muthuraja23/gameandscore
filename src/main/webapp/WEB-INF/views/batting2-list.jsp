<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Batting 2 Score</title>
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
				<c:forEach var="Batting2" items="${batting2details}">
					<tr>
						<td>${Batting2.team}</td>
						<td>${Batting2.playername}</td>
						<td>${Batting2.runsscored}</td>
						<td>${Batting2.ballsfaced}</td>
						<td>${Batting2.fours}</td>
						<td>${Batting2.sixes}</td>
						<td>${Batting2.strikerate}</td>
						<td>${Batting2.status}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>