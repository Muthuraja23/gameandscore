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
					<th>Batting Id</th>
					<th>Game Id</th>
					<th>Team</th>
					<th>Player Name</th>
					<th>Runs Scored</th>
					<th>Balls Faced</th>
					<th>Fours</th>
					<th>Sixes</th>
					<th>Strike Rate</th>
					<th>Status</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="CrSbBattingDetails" items="${alldetails}">
					<tr>
						<td>${CrSbBattingDetails.crbattingid}</td>
						<td>${CrSbBattingDetails.gameid}</td>
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