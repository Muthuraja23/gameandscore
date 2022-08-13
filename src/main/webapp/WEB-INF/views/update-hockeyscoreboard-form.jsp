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
			<form:form action="update" method="post"
				modelAttribute="updatescore">
				<div>
					<label for="hscoreboardid">Hockey Scoreboard Id</label>
					<div>
						<form:input path="hscoreboardid" />
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
					<label for="team1score">Team 1 Score</label>
					<div>
						<form:input path="team1score" />
					</div>
				</div>
				<div>
					<label for="team2score">Team 2 Score</label>
					<div>
						<form:input path="team2score" />
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