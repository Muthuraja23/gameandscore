<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Team</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="updateteam" method="post"
				modelAttribute="updateteam">
				<div>
					<label for="teamid">Team id</label>
					<div>
						<form:input path="teamid" />
					</div>
				</div>
				<div>
					<label for="teamname">Team Name</label>
					<div>
						<form:input path="teamname" />
					</div>
				</div>
				<div>
					<label for="startdate">Start Date</label>
					<div>
						<form:input path="startdate" />
					</div>
				</div>
				<div>
					<label for="totalplayers">Total Players</label>
					<div>
						<form:input path="totalplayers" />
					</div>
				</div>
				<div>
					<label for="country">Country</label>
					<div>
						<form:input path="country" />
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" />
					</div>
				</div>
				<div>
					<label for="owner">Owner</label>
					<div>
						<form:input path="owner" />
					</div>
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" />
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