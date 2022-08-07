<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Scoreboard</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="updatescore" method="post"
				modelAttribute="updatescore">
				<div>
					<label for="sno">S.NO</label>
					<div>
						<form:input path="sno" />
					</div>
				</div>
				<div>
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div>
					<label for="totalruns">Total Runs</label>
					<div>
						<form:input path="totalruns" />
					</div>
				</div>
				<div>
					<label for="overs">Overs</label>
					<div>
						<form:input path="overs" />
					</div>
				</div>
				<div>
					<label for="totalwickets">Total Wickets</label>
					<div>
						<form:input path="totalwickets" />
					</div>
				</div>
				<div>
					<label for="result">Result</label>
					<div>
						<form:input path="result" />
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