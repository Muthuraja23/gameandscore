<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>BowlingDetails List</title>
<style>
<%@ include file="css/navigationbar.css"%>
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
					<th>Overs</th>
					<th>Wickets</th>
					<th>Runs</th>
					<th>Maiden</th>
					<th>Economy</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="CrSbBowlingDetails" items="${bowlingdetails}">
					<tr>
						<td>${CrSbBowlingDetails.team}</td>
						<td>${CrSbBowlingDetails.playerName}</td>
						<td>${CrSbBowlingDetails.overs}</td>
						<td>${CrSbBowlingDetails.wickets}</td>
						<td>${CrSbBowlingDetails.runs}</td>
						<td>${CrSbBowlingDetails.maiden}</td>
						<td>${CrSbBowlingDetails.economy}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>