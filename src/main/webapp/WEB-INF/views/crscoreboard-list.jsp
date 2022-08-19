<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Cricket ScoreBoard List</title>
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
						<th>Match</th>
						<th>Team 1 Score</th>
						<th>Overs</th>
						<th>Team 2 Score</th>
						<th>Overs</th>
						<th>Result</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="CrScoreboard" items="${score}">
						<tr>
							<td>${CrScoreboard.matchbetween}</td>
							<td>${CrScoreboard.team1}</td>
							<td>${CrScoreboard.oversbyt1}</td>
							<td>${CrScoreboard.team2}</td>
							<td>${CrScoreboard.oversbyt2}</td>
							<td>${CrScoreboard.result}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div id="table root">
			<table class = bat-table>
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
					<c:forEach var="CrSbBattingDetails" items="${bat}">
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
		<div id="table root">
			<table class = bowl-table>
			<caption></caption>
				<thead>
					<tr>
						<th>Team</th>
						<th>Name</th>
						<th>Overs</th>
						<th>Maiden</th>
						<th>Runs</th>
						<th>Wickets</th>
						<th>Economy</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="CrSbBowlingDetails" items="${ball}">
						<tr>
							<td>${CrSbBowlingDetails.team}</td>
							<td>${CrSbBowlingDetails.playername}</td>
							<td>${CrSbBowlingDetails.overs}</td>
							<td>${CrSbBowlingDetails.maiden}</td>							
							<td>${CrSbBowlingDetails.runs}</td>
							<td>${CrSbBowlingDetails.wickets}</td>
							<td>${CrSbBowlingDetails.economy}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
</body>
</html>