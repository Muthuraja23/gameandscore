<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Update Game 2</title>
</head>
<body>
<div id="root">
		<div id="form">
			<form:form action="update2" method="post"
				modelAttribute="update2details">
				<div>
					<label for="crbattingid">cricket Scoreboard Id</label>
					<div>
						<form:input path="crbattingid" />
					</div>
				</div>
				<div>
					<label for="gameid">Game id</label>
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
				<form:errors path="team" cssClass="text-danger" />
				<div>
					<label for="playername">Player Name</label>
					<div>
						<form:input path="playername" />
					</div>
				</div>
				<div>
					<label for="runsscored">Runs Scored</label>
					<div>
						<form:input path="runsscored" />
					</div>
				</div>
				<div>
					<label for="ballsfaced">Balls Faced</label>
					<div>
						<form:input path="ballsfaced" />
					</div>
				</div>
				<div>
					<label for="fours">Fours</label>
					<div>
						<form:input path="fours" />
					</div>
				</div>
				<div>
					<label for="sixes">Sixes</label>
					<div>
						<form:input path="sixes" />
					</div>
				</div>
				<div>
					<label for="strikerate">Strike Rate</label>
					<div>
						<form:input path="strikerate" />
					</div>
				</div>
				<div>
					<label for="status">Status</label>
					<div>
						<form:input path="status" />
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