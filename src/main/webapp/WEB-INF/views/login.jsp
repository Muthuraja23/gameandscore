<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="loginValidation" method="post" modelAttribute="login">
				<div>
					<label for="adminId">Id</label>
					<div>
						<form:input path="adminId" />
					</div>
				</div>
				<div>
					<label for="password">Password</label>
					<div>
						<form:password path="password" />
					</div>
				</div>
				<div>
					<form:button>login</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>