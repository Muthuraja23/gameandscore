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
					<th>Team 1</th>
					<th>Shots</th>
					<th>Hits</th>
					<th>Penalties</th>
					<th>Blocked Shots</th>
					<th>Team 2</th>
					<th>Shots</th>
					<th>Hits</th>
					<th>Penalties</th>
					<th>Blocked Shots</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="HSbGoals" items="${allgoals}">
					<tr>
						<td>${HSbGoals.team1}</td>
						<td>${HSbGoals.t1shots}</td>
						<td>${HSbGoals.t1hits}</td>
						<td>${HSbGoals.t1totalpenalties}</td>
						<td>${HSbGoals.t1blockedshots}</td>
						<td>${HSbGoals.team2}</td>
						<td>${HSbGoals.t2shots}</td>
						<td>${HSbGoals.t2hits}</td>
						<td>${HSbGoals.t2totalpenalties}</td>
						<td>${HSbGoals.t2blockedshots}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>