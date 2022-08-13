<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add TeamPlayerDetails Form</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addteamplayerdetails">
				<div>
					<label for="teamplayerid">Team Player Id</label>
					<div>
						<form:input path="teamplayerid" />
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
					<label for="dateofjoining">Date of Joining</label>
					<div>
						<form:input path="dateofjoining" />
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" />
					</div>
				</div>
				<div>
					<label for="dateofleaving">Date of Leaving</label>
					<div>
						<form:input path="dateofleaving" />
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