<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sports List</title>
</head>
<body>
	<div id="table root">
		<table>
			<thead>
				<tr>
					<th>sportsid</th>
					<th>sportsname</th>
					<th>noofteamspergame</th>
					<th>maxplayersperteam</th>
				</tr>
				</thead>
			<tbody>
				<c:forEach var="Sports" items="${allsports}">
					<tr>
						<td>${Sports.sportsid}</td>
						<td>${Sports.sportsname}</td>
						<td>${Sports.noofteamspergame}</td>
						<td>${Sports.maxplayersperteam}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
</body>
</html>