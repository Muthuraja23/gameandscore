<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Update Game</title>
<style>
.text-danger {
    color: #e80c4d;
    font-size: 0.9em;
}
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="updatescore" method="post"
				modelAttribute="updatescore">
				<div>
					<label for="crscoreboardid">Cricket Scoreboard Id</label>
					<div>
						<form:input path="crscoreboardid" />
					</div>
				</div>
				<div>
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div>
					<label for="matchbetween">Match Between</label>
					<div>
						<form:input path="matchbetween" />
					</div>
				</div>
				<div>
					<label for="team1">Team 1</label>
					<div>
						<form:input path="team1" />
					</div>
				</div>
				<div>
					<label for="oversbyt1">Overs</label>
					<div>
						<form:input path="oversbyt1" />
					</div>
				</div>
				<div>
					<label for="team2">Team 2</label>
					<div>
						<form:input path="team2" />
					</div>
				</div>
				<div>
					<label for="oversbyt2">Overs</label>
					<div>
						<form:input path="oversbyt2" />
					</div>
				</div>
				<div>
					<label for="result">Result</label>
					<div>
						<form:input path="result" />
					</div>
				</div>
				<div>
					<form:button>Update</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>