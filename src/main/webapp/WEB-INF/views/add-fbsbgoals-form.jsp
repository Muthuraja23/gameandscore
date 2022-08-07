<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update FbSbGoals</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post"
				modelAttribute="addgoal">
				<div>
					<label for="fbgoalsid">Football Goal Id</label>
					<div>
						<form:input path="fbgoalsid" />
					</div>
				</div>
				<div>
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div>
					<label for="team">Team</label>
					<div>
						<form:input path="team" />
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
					<label for="goalattempt">Goal Attempts</label>
					<div>
						<form:input path="goalattempt" />
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
					<form:button>Add</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>