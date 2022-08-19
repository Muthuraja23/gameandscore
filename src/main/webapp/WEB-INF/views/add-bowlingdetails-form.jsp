<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add BowlingDetails Form</title>
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
			<form:form action="add" method="post" modelAttribute="adddetails">
				<div>
					<label for="crbowlingid">Bowling id</label>
					<div>
						<form:input path="crbowlingid" />
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
					<label for="playername">Name</label>
					<div>
						<form:input path="playername" />
					</div>
				</div>
				<div>
					<label for="overs">Overs</label>
					<div>
						<form:input path="overs" />
					</div>
				</div>
				<div>
					<label for="wickets">Wickets</label>
					<div>
						<form:input path="wickets" />
					</div>
				</div>
				<div>
					<label for="runs">Runs</label>
					<div>
						<form:input path="runs" />
					</div>
				</div>
				<div>
					<label for="maiden">Maiden</label>
					<div>
						<form:input path="maiden" />
					</div>
				</div>
				<div>
					<label for="economy">Economy</label>
					<div>
						<form:input path="economy" />
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