<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Batting Score</title>
<style>
<%@ include file="css/navigationbar.css"%>
<%@ include file="css/table.css"%>
</style>
</head>
<body>
	<div id="table root">
		<table class=content-table>
		<caption></caption>
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
				<c:forEach var="CrSbBattingDetails" items="${battingdetails}">
					<tr>
						<td>${CrSbBattingDetails.team}</td>
						<td>${CrSbBattingDetails.playername}</td>
						<td>${CrSbBattingDetails.runsscored}</td>
						<td>${CrSbBattingDetails.ballsfaced}</td>
						<td>${CrSbBattingDetails.fours}</td>
						<td>${CrSbBattingDetails.sixes}</td>
						<td>${CrSbBattingDetails.strikerate}</td>
						<td>${CrSbBattingDetails.status}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>