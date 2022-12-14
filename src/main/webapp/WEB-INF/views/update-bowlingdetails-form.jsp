<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Update Bowling Details</title>
<style>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post"
				modelAttribute="updatebowling">
				<div>
				<form:input path="crbowlingid" type="hidden"/>
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
					<label for="playerName">Name</label>
					<div>
						<form:input path="playerName" />
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
					<form:button>Update</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>