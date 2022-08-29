<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add Cricket ScoreBoard</title>
<style>
	<%@include file="css/add.css"%>
	<%@include file="css/form.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addscore">
				<div class="font">
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div class="font">
					<label for="matchbetween">Match</label>
					<div>
						<form:input path="matchbetween" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="team1">Team 1</label>
					<div>
						<form:input path="team1" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="oversbyt1">Overs</label>
					<div>
						<form:input path="oversbyt1" />
					</div>
				</div>
				<div class="font">
					<label for="team2">Team 2</label>
					<div>
						<form:input path="team2" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="oversbyt2">Overs</label>
					<div>
						<form:input path="oversbyt2" />
					</div>
				</div>
				<div class="font">
					<label for="result">Result</label>
					<div>
						<form:input path="result" pattern="^[A-Za-z0-9\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
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