<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Player List</title>
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
					<th>Name</th>
					<th>DOB</th>
					<th>Gender</th>
					<th>Game</th>
					<th>Team</th>
					<th>Skill</th>
					<th>BloodGroup</th>
					<th>Height</th>
					<th>Weight</th>
					<th>Grade</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Player" items="${allplayers}">
					<tr>
						<td>${Player.name}</td>
						<td>${Player.dob}</td>
						<td>${Player.gender}</td>
						<td>${Player.game}</td>
						<td>${Player.team}</td>
						<td>${Player.skill}</td>
						<td>${Player.bloodgroup}</td>
						<td>${Player.height}</td>
						<td>${Player.weight}</td>
						<td>${Player.grade}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>