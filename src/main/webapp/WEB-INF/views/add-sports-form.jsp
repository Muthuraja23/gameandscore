<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add Sports</title>
<style>
	<%@include file="css/add.css"%>
	<%@include file="css/form.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addsports">
				<div class="font">
					<label for="sportsid">Sports Id</label>
					<div>
						<form:input path="sportsid" />
					</div>
				</div>
				<div class="font">
					<label for="sportsname">Sports Name</label>
					<div>
						<form:input path="sportsname" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only"  required="true" />
					</div>
				</div>
				<div class="font">
					<label for="noofteamsparticipating">No.of Teams Participating</label>
					<div>
						<form:input path="noofteamsparticipating" />
					</div>
				</div>
				<div >
				 <form:button>Add</form:button>
                </div>
            </form:form>
            </div>
            </div>
</body>
</html>