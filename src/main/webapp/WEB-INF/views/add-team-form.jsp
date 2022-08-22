<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add Team Form</title>
<style>
	<%@include file="css/add.css"%>
	<%@include file="css/form.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addteam">
				<div class="font">
					<label for="teamname">Team Name</label>
					<div>
						<form:input path="teamname" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="startdate">Start Date</label>
					<div>
						<form:input type="date" path="startdate" />
					</div>
				</div>
				<div class="font">
					<label for="totalplayers">Total Players</label>
					<div>
						<form:input path="totalplayers" />
					</div>
				</div>
				<div class="font">
					<label for="country">Country</label>
					<div>
						<form:input path="country" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="status">Status</label>
					<div>
						<form:input path="status" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="owner">Owner</label>
					<div>
						<form:input path="owner" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="email">Email</label>
					<div>
						<form:input path="email"  pattern="^[a-z0-9+_.-]+@[a-zA-Z0-9.-]+$"
                            title="Enter a valid email hello@gmail.com" required="true"/>
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