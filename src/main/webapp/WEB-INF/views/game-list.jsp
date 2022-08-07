<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Game List</title>
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
					<th>Game Id</th>
					<th>Game Between</th>
					<th>Sports Id</th>
					<th>Date</th>
					<th>Time</th>
					<th>Result</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Game" items="${allgames}">
					<tr>
						<td>${Game.gameid}</td>
						<td>${Game.gamebetween}</td>
						<td>${Game.sportsid}</td>
						<td>${Game.date}</td>
						<td>${Game.time}</td>
						<td>${Game.result}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>