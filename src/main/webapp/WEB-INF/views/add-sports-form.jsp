<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Sports</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addsports">
				<div>
					<label for="sportsid">Sports Id</label>
					<div>
						<form:input path="sportsid" />
					</div>
				</div>
				<div>
					<label for="sportsname">Sports Name</label>
					<div>
						<form:input path="sportsname" />
					</div>
				</div>
				<div>
					<label for="noofteamspergame">No.of Teams per Game</label>
					<div>
						<form:input path="noofteamspergame" />
					</div>
				</div>
				<div>
					<label for="max_players_perteam">Max.Players Per Team</label>
					<div>
						<form:input path="maxplayersperteam" />
					</div>
				</div>
				<div>
				 <form:button>Add New</form:button>
                </div>
            </form:form>
            </div>
            </div>
</body>
</html>