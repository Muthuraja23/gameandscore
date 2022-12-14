<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Update Player</title>
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
			<form:form action="updateplayer" method="post"
				modelAttribute="updateplayer">
				<div>
				<form:input path="playerid" type="hidden"/>
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
				<div>
					<label for="game">Game</label>
					<div>
						<form:input path="game" />
					</div>
				</div>
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
					<form:button>Update</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>