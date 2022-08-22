<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="com.chainsys.gameandscore.businesslogic.Logic"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Add Game</title>
<style>
	<%@ include file = "css/add.css"%>
	<%-- <%@include file="css/cricketbg.css"%> --%>
	<%@include file="css/form.css"%>
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addgame">
				<div class="font">
					<label for="gamebetween">Match</label>
					<div>
						<form:input path="gamebetween" pattern="^[A-Za-z\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div class="font">
					<label for="sportsid">Sports Id</label>
					<div class="custom-select" style="width: 90%" >
						<form:select path="sportsid" >
						<form:option value="0"></form:option>
						<form:option value="1"></form:option>
						<form:option value="2"></form:option>
						<form:option value="3"></form:option>
						</form:select>
					</div>
				</div>
				<div class="font">
					<label for="dateandtime">Date</label>
					<div>
						<form:input type="date" max="<%=Logic.getInstanceDate()%>"  path="dateandtime" />
					</div>
				</div>
				<div class="font">
					<label for="result">Result</label>
					<div>
						<form:input path="result" pattern="^[A-Za-z0-9\s]*$"
                            title="Please Enter Charactor Only" required="true"/>
					</div>
				</div>
				<div id="bg">
					<button type="submit" value="add">Add</button>
				</div>
			</form:form>
			</div>
		</div>
	<script type="text/javascript">
<%@include file="js/select.js"%>
</script>
</body>
</html>