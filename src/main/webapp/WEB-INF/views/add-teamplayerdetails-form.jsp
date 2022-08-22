<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add TeamPlayerDetails Form</title>
<style>
	<%@include file="css/add.css"%>
	<%@include file="css/form.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addteamplayerdetails">
				<div class="font">
					<label for="teamplayerid">Team Player Id</label>
					<div>
						<form:input path="teamplayerid" />
					</div>
				</div>
				<div class="font">
					<label for="teamid">Team Id</label>
					<div>
						<form:input path="teamid" />
					</div>
				</div>
				<div class="font">
					<label for="team">Team</label>
					<div>
						<form:input path="team" />
					</div>
				</div>
				<div class="font">
					<label for="playerid">Player Id</label>
					<div>
						<form:input path="playerid" />
					</div>
				</div>
				<div class="font">
					<label for="name">Name</label>
					<div>
						<form:input path="name" />
					</div>
				</div>
				<div class="font">
					<label for="dateofjoining">Date of Joining</label>
					<div>
						<form:input path="dateofjoining" />
					</div>
				</div>
				<div class="font">
					<label for="status">Status</label>
					<div>
						<form:input path="status" />
					</div>
				</div>
				<div class="font">
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