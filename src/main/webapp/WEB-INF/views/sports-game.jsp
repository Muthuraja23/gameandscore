<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sports</title>
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
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="getsportsid">
				<div>
					<label for="sportsid">Sports Id</label>
					<div>
						<form:input path="sportsid" />
					</div>
				</div>
				<div>
					<label for="sportsname">Sports Name</label>
					<div>
						<form:input path="sportsname" />
					</div>
				</div>
				<div>
					<label for="noofteamspergame">No.of Teams per Game</label>
					<div>
						<form:input path="noofteamspergame" />
					</div>
				</div>
				<div>
					<label for="max_players_perteam">Max.Players Per Team</label>
					<div>
						<form:input path="maxplayersperteam" />
					</div>
				</div>
			</form:form>
			<div id="getgamelist">
				<table>
					<thead>
						<tr>
							<!-- <th>Sports Id</th>
							<th>Sports Name</th>
							<th>No.of Teams Per Game</th>
							<th>Max.Players Per Team</th> -->

							<th>Game Id</th>
							<th>Game Name</th>
							<th>Sports Id</th>
							<th>Start Date</th>
							<th>Start Time</th>
							<th>End Date</th>
							<th>End Time</th>
							<th>Result</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="Game" items="${getgamelist}">
							<tr>
								<%-- <td>${sports.sportsid}</td>
								<td>${sports.sportsname}</td>
								<td>${sports.noofteamspergame}</td>
								<td>${sports.maxplayersperteam}</td> --%>

								<td>${Game.gameid}</td>
								<td>${Game.gamename}</td>
								<td>${Game.sportsid}</td>
								<td>${Game.startdate}</td>
								<td>${Game.starttime}</td>
								<td>${Game.enddate}</td>
								<td>${Game.endtime}</td>
								<td>${Game.result}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>