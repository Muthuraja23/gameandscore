<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add Football Scoreboard Form</title>
<style>
	<%@include file="css/form.css"%>
.text-danger {
    color: #e80c4d;
    font-size: 0.9em;
}
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addscore">
				<div>
					<label for="fbscoreboardid">Football ScoreBoard Id</label>
					<div>
						<form:input path="fbscoreboardid" />
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
					<label for="team1score">Team1 Score</label>
					<div>
						<form:input path="team1score" />
					</div>
				</div>
				<div>
					<label for="team2score">Team2 Score</label>
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
					<form:button>Add</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>