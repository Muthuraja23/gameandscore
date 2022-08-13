<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add Hockey Goals Form</title>
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
			<form:form action="update" method="post" modelAttribute="updategoal">
				<div>
					<label for="hgoalsid">Hockey Goal Id</label>
					<div>
						<form:input path="hgoalsid" />
					</div>
				</div>
				<div>
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div>
					<label for="teamname">Team</label>
					<div>
						<form:input path="teamname" />
					</div>
				</div>
				<div>
					<label for="playername">Player Name</label>
					<div>
						<form:input path="playername" />
					</div>
				</div>
				<div>
					<label for="goalscored">Goals Scored</label>
					<div>
						<form:input path="goalscored" />
					</div>
				</div>
				<div>
					<label for="time">Time</label>
					<div>
						<form:input path="time" />
					</div>
				</div>
				<div>
					<label for="fouls">Fouls</label>
					<div>
						<form:input path="fouls" />
					</div>
				</div>
				<div>
					<label for="tackles">Tackles</label>
					<div>
						<form:input path="tackles" />
					</div>
				</div>
				<div>
					<label for="assist">Assist</label>
					<div>
						<form:input path="assist" />
					</div>
				</div>
				<div>
					<label for="goalsattempt">Goal Attempts</label>
					<div>
						<form:input path="goalsattempt" />
					</div>
				</div>
				<div>
					<label for="penalty">Penalty</label>
					<div>
						<form:input path="penalty" />
					</div>
				</div>
				<div>
					<label for="corners">Corners</label>
					<div>
						<form:input path="corners" />
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