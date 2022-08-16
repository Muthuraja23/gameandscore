<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add FbSbGoals</title>
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
			<form:form action="add" method="post" modelAttribute="addgoal">
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
					<label for="team1">Team1</label>
					<div>
						<form:input path="team1" />
					</div>
				</div>
				<div>
					<label for="t1fouls">Fouls</label>
					<div>
						<form:input path="t1fouls" />
					</div>
				</div>
				<div>
					<label for="t1yrcards">Yellow/Red Cards</label>
					<div>
						<form:input path="t1yrcards" />
					</div>
				</div>
				<div>
					<label for="t1corners">Corners</label>
					<div>
						<form:input path="t1corners" />
					</div>
				</div>
				<div>
					<label for="t1saves">Saves</label>
					<div>
						<form:input path="t1saves" />
					</div>
				</div>
				<label for="team2">Team2</label>
				<div>
					<form:input path="team2" />
				</div>
		</div>
		<div>
			<label for="t2fouls">Fouls</label>
			<div>
				<form:input path="t2fouls" />
			</div>
		</div>
		<div>
			<label for="t2yrcards">Yellow/Red Cards</label>
			<div>
				<form:input path="t2yrcards" />
			</div>
		</div>
		<div>
			<label for="t2corners">Corners</label>
			<div>
				<form:input path="t2corners" />
			</div>
		</div>
		<div>
			<label for="t2saves">Saves</label>
			<div>
				<form:input path="t2saves" />
			</div>
		</div>
		<div>
			<form:button>Add</form:button>
		</div>
		</form:form>
	</div>
</body>
</html>