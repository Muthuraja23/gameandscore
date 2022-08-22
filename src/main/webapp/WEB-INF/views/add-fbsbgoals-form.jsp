<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add FbSbGoals</title>
<style>
	<%@include file="css/add.css"%>
	<%@include file="css/form.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addgoal">
				<div class="font">
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div class="font">
					<label for="team1">Team1</label>
					<div>
						<form:input path="team1" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="t1fouls">Fouls</label>
					<div>
						<form:input path="t1fouls" />
					</div>
				</div>
				<div class="font">
					<label for="t1yrcards">Yellow/Red Cards</label>
					<div>
						<form:input path="t1yrcards" />
					</div>
				</div>
				<div class="font">
					<label for="t1corners">Corners</label>
					<div>
						<form:input path="t1corners" />
					</div>
				</div>
				<div class="font">
					<label for="t1saves">Saves</label>
					<div>
						<form:input path="t1saves" />
					</div>
				</div>
				<div class="font">
					<label for="team2">Team2</label>
					<div>
						<form:input path="team2" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="t2fouls">Fouls</label>
					<div>
						<form:input path="t2fouls" />
					</div>
				</div>
				<div class="font">
					<label for="t2yrcards">Yellow/Red Cards</label>
					<div>
						<form:input path="t2yrcards" />
					</div>
				</div>
				<div class="font">
					<label for="t2corners">Corners</label>
					<div>
						<form:input path="t2corners" />
					</div>
				</div>
				<div class="font">
					<label for="t2saves">Saves</label>
					<div>
						<form:input path="t2saves" />
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