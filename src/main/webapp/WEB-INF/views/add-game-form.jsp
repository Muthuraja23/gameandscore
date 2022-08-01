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
			<form:form action="add" method="post" modelAttribute="addgame">
				<div>
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div>
					<label for="gamename">Game Name</label>
					<div>
						<form:input path="gamename" />
					</div>
				</div>
				<div>
					<label for="sportsid">Sports Id</label>
					<div>
						<form:input path="sportsid" />
					</div>
				</div>
				<div>
					<label for="startdate">Start Date</label>
					<div>
						<form:input path="startdate" />
					</div>
				</div>
					<div>
					<label for="starttime">Start Time</label>
					<div>
						<form:input path="starttime" />
					</div>
				</div>
				<div>
					<label for="enddate">End Date</label>
					<div>
						<form:input path="enddate" />
					</div>
				</div>
				<div>
					<label for="enddate">End Time</label>
					<div>
						<form:input path="enddate" />
					</div>
				</div>
				<div>
					<label for="result">Result</label>
					<div>
						<form:input path="result" />
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