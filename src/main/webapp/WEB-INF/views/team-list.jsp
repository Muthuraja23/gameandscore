<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Team List</title>
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
					<th>Team Id</th>
					<th>Team Name</th>
					<th>Start Date</th>
					<th>Total Players</th>
					<th>Country</th>
					<th>Status</th>
					<th>Owner</th>
					<th>Email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Team" items="${allteams}">
					<tr>
						<td>${Team.teamid}</td>
						<td>${Team.teamname}</td>
						<td>${Team.startdate}</td>
						<td>${Team.totalplayers}</td>
						<td>${Team.country}</td>
						<td>${Team.status}</td>
						<td>${Team.owner}</td>
						<td>${Team.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>