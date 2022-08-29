<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Score</title>
<style>
*{
text-align:center;
}
<%@ include file = "css/table.css"%> 
</style>
</head>
<body>
	<div id="table root">
		<table class=content-table>
		<caption></caption>
			<thead>
				<tr>
					<th>Name</th>
					<th>Team</th>
					<th>Skill</th>
					<th>Add Score</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="teamA" items="${teamAplayerlist}">
					<tr>
						<td>${teamA.name}</td>
						<td>${teamA.team}</td>
						<td>${teamA.skill}</td>
						<td><a href="/player/select?id=${gameId}&playerId=${teamA.playerid}"><button>Add Score</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<div id="table root">
		<table class=content-table>
		<caption></caption>
			<thead>
				<tr>
					<th>Name</th>
					<th>Team</th>
					<th>Skill</th>
					<th>Add Score</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="teamB" items="${teamBplayerlist}">
					<tr>
						<td>${teamB.name}</td>
						<td>${teamB.team}</td>
						<td>${teamB.skill}</td>
						<td><a  href="/player/select?id=${gameId}&playerId=${teamB.playerid}"><button>Add Score</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<div id="table root">
		<h1>1st Innings</h1>
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
				<c:forEach var="BattingDetails" items="${teamAbatting}">
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
		<table class=content-table>
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
				<c:forEach var="BowlingDetails" items="${teamBbowling}">
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
	
	
	
	
	
	<div id="table root">
		<h1>2nd Innings </h1>
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
				<c:forEach var="BattingDetails" items="${teamBbatting}">
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
		<table class=content-table>
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
				<c:forEach var="BowlingDetails" items="${teamAbowling}">
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
	<div><a href="/cricket/getscore?id=${gameId}"><button>Total Score</button></a></div>
</body>
</html>