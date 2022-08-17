<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>TeamPlayerDetails List</title>
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
		<caption></caption>
			<thead>
				<tr>
					<th>Team</th>
					<th>Name</th>
					<th>Date Of Joining</th>
					<th>Status</th>
					<th>Date Of Leaving </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="TeamPlayerDetails" items="${allteamplayerdetails}">
					<tr>
						<td>${TeamPlayerDetails.team}</td>
						<td>${TeamPlayerDetails.name}</td>
						<td>${TeamPlayerDetails.dateofjoining}</td>
						<td>${TeamPlayerDetails.status}</td>
						<td>${TeamPlayerDetails.dateofleaving}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>