<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add Player Form</title>
<style>
	<%@include file="css/add.css"%>
	<%@include file="css/form.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addplayer">
				<div class="font">
					<label for="playerid">Player Id</label>
					<div>
						<form:input path="playerid" />
					</div>
				</div>
				<div class="font">
					<label for="name">Name</label>
					<div>
						<form:input path="name" />
					</div>
				</div>
				<div class="font">
					<label for="dob">Date Of Birth</label>
					<div>
						<form:input path="dob" />
					</div>
				</div>
				<div class="font">
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" />
					</div>
				</div>
				<div class="font">
					<label for="game">Game</label>
					<div>
						<form:input path="game" />
					</div>
				</div>
				<div class="font">
					<label for="teamid">Team Id</label>
					<div>
						<form:input path="teamid" />
					</div>
				</div>
				<div class="font">
					<label for="team">Team</label>
					<div>
						<form:input path="team" />
					</div>
				</div>
				<div class="font">
					<label for="skill">Skill</label>
					<div>
						<form:input path="skill" />
					</div>
				</div>
				<div class="font">
					<label for="bloodgroup">Blood Group</label>
					<div>
						<form:input path="bloodgroup" />
					</div>
				</div>
				<div class="font">
					<label for="height">Height</label>
					<div>
						<form:input path="height" />
					</div>
				</div>
				<div class="font">
					<label for="weight">Weight</label>
					<div>
						<form:input path="weight" />
					</div>
				</div>
				<div class="font">
					<label for="grade">Grade</label>
					<div>
						<form:input path="grade" />
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
