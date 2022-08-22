<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add BattingDetails Form</title>
<style>
	<%@include file="css/add.css"%>
<%@include file="css/form.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addbattingdetails">
				<div class="font">
					<label for="gameid">Game id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div class="font">
					<label for="team">Team</label>
					<div>
						<form:input path="team" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="playername">Player Name</label>
					<div>
						<form:input path="playername" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true" />
					</div>
				</div>
				<div class="font">
					<label for="runsscored">Runs Scored</label>
					<div>
						<form:input path="runsscored" />
					</div>
				</div>
				<div class="font">
					<label for="ballsfaced">Balls Faced</label>
					<div>
						<form:input path="ballsfaced" />
					</div>
				</div>
				<div class="font">
					<label for="fours">Fours</label>
					<div>
						<form:input path="fours" />
					</div>
				</div>
				<div class="font">
					<label for="sixes">Sixes</label>
					<div>
						<form:input path="sixes" />
					</div>
				</div>
				<div class="font">
					<label for="strikerate">Strike Rate</label>
					<div>
						<form:input path="strikerate" />
					</div>
				</div>
				<div class="font">
					<label for="status">Status</label>
					<div>
						<form:input path="status" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
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