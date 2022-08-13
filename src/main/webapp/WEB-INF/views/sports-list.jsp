<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Sports List</title>
</head>
<body>
	<h1 align="center">Sports List</h1>
	<div id="table root">
		<table border="8" cellpadding="30%" align="center" bordercolor="blue">
			<thead>
				<tr>
					<th>Sports Name</th>
					<th>No.of Teams Participating</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="Sports" items="${allsports}">
					<tr>
						<td>${Sports.sportsname}</td>
						<td>${Sports.noofteamsparticipating}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>