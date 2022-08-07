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
<img src="file:///C:/Users/muth3126/Desktop/bg1.jpg" height="1000" width="1000">
  <h1 align="center">Sports List</h1> 
	<div id="table root">
		<table border="8" cellpadding="30%" align="center" bordercolor="blue">
			<thead>
				<tr>
					<th>Sports Id</th>
					<th>Sports Name</th>
					<th>No.of Teams Participating</th>
				</tr>
				</thead>
			<tbody>
				<c:forEach var="Sports" items="${allsports}">
					<tr>
						<td>${Sports.sportsid}</td>
						<td>${Sports.sportsname}</td>
						<td>${Sports.noofteamsparticipating}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
</body>
</html>