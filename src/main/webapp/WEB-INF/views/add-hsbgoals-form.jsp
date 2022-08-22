<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add HSbGoals</title>
<style>
	<%@include file="css/form.css"%>

</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post"
				modelAttribute="addgoal">
				<div class="font">
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div class="font">
					<label for="team1">Team 1</label>
					<div>
						<form:input path="team1" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="t1shots">Shots</label>
					<div>
						<form:input path="t1shots" />
					</div>
				</div>
				<div class="font">
					<label for="t1hits">Hits</label>
					<div>
						<form:input path="t1hits" />
					</div>
				</div>
				<div class="font">
					<label for="t1totalpenalties">Penalties</label>
					<div>
						<form:input path="t1totalpenalties" />
					</div>
				</div>
				<div class="font">
					<label for="t1blockedshots">Blocked Shots</label>
					<div>
						<form:input path="t1blockedshots" />
					</div>
				</div>
				<div class="font">
					<label for="team2">Team 2</label>
					<div>
						<form:input path="team2" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="t2shots">Shots</label>
					<div>
						<form:input path="t2shots" />
					</div>
				</div>
				<div class="font">
					<label for="t2hits">Hits</label>
					<div>
						<form:input path="t2hits" />
					</div>
				</div>
				<div class="font">
					<label for="t2totalpenalties">Penalties</label>
					<div>
						<form:input path="t2totalpenalties" />
					</div>
				</div>
				<div class="font">
					<label for="t2blockedshots">Blocked Shots</label>
					<div>
						<form:input path="t2blockedshots" />
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