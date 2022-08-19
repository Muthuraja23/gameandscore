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
			<form:form action="add" method="post" modelAttribute="addplayer">
				<div>
					<label for="playerid">Player Id</label>
					<div>
						<form:input path="playerid" />
					</div>
				</div>
				<div>
					<label for="name">Name</label>
					<div>
						<form:input path="name" />
					</div>
				</div>
				<div>
					<label for="dob">Date Of Birth</label>
					<div>
						<form:input path="dob" />
					</div>
				</div>
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" />
					</div>
				</div>
				<form:errors path="gender" cssClass="text-danger" />
				<div>
					<label for="game">Game</label>
					<div>
						<form:input path="game" />
					</div>
				</div>
				<form:errors path="game" cssClass="text-danger" />
				<div>
					<label for="teamid">Team Id</label>
					<div>
						<form:input path="teamid" />
					</div>
				</div>
				<div>
					<label for="team">Team</label>
					<div>
						<form:input path="team" />
					</div>
				</div>
				<div>
					<label for="skill">Skill</label>
					<div>
						<form:input path="skill" />
					</div>
				</div>
				<div>
					<label for="bloodgroup">Blood Group</label>
					<div>
						<form:input path="bloodgroup" />
					</div>
				</div>
				<div>
					<label for="height">Height</label>
					<div>
						<form:input path="height" />
					</div>
				</div>
				<div>
					<label for="weight">Weight</label>
					<div>
						<form:input path="weight" />
					</div>
				</div>
				<div>
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
