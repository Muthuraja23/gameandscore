<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Bowling Details</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post"
				modelAttribute="updatebowling">
				<div>
					<label for="crbowlingid">Cricket Bowling id</label>
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
					<label for="teamid">Team Id</label>
					<div>
						<form:input path="teamid" />
					</div>
				</div>
				<div>
					<label for="playername">Player Name</label>
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
					<label for="dotballs">Dot Balls</label>
					<div>
						<form:input path="dotballs" />
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