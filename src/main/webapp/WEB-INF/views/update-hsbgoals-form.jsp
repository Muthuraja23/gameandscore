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
					<label for="team1">Team 1</label>
					<div>
						<form:input path="team1" />
					</div>
				</div>
				<div>
					<label for="t1shots">Shots</label>
					<div>
						<form:input path="t1shots" />
					</div>
				</div>
				<div>
					<label for="t1hits">Hits</label>
					<div>
						<form:input path="t1hits" />
					</div>
				</div>
				<div>
					<label for="t1totalpenalties">Penalties</label>
					<div>
						<form:input path="t1totalpenalties" />
					</div>
				</div>
				<div>
					<label for="t1blockedshots">Blocked Shots</label>
					<div>
						<form:input path="t1blockedshots" />
					</div>
				</div>
				<div>
					<label for="team2">Team 2</label>
					<div>
						<form:input path="team2" />
					</div>
				</div>
				<div>
					<label for="t2shots">Shots</label>
					<div>
						<form:input path="t2shots" />
					</div>
				</div>
				<div>
					<label for="t2hits">Hits</label>
					<div>
						<form:input path="t2hits" />
					</div>
				</div>
				<div>
					<label for="t2totalpenalties">Penalties</label>
					<div>
						<form:input path="t2totalpenalties" />
					</div>
				</div>
				<div>
					<label for="t2blockedshots">Blocked Shots</label>
					<div>
						<form:input path="t2blockedshots" />
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