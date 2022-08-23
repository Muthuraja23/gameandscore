<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Update Game</title>
<style>
.text-danger {
    color: #e80c4d;
    font-size: 0.9em;
}
</style>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="update" method="post"
				modelAttribute="updatescore">
				<div>
				<form:input path="hscorboardid" type="hidden"/>
				</div>
				<div>
					<label for="gameid">Game Id</label>
					<div>
						<form:input path="gameid" />
					</div>
				</div>
				<div>
					<label for="team1">Team 1</label>
					<div>
						<form:input path="team1" />
					</div>
				</div>
				<div>
					<label for="t1period1">1</label>
					<div>
						<form:input path="t1period1" />
					</div>
				</div>
				<div>
					<label for="t1period2">2</label>
					<div>
						<form:input path="t1period2" />
					</div>
				</div>
				<div>
					<label for="t1period3">3</label>
					<div>
						<form:input path="t1period3" />
					</div>
				</div>
				<div>
					<label for="t1ot">OT</label>
					<div>
						<form:input path="t1ot" />
					</div>
				</div>
				<div>
					<label for="t1total">Total</label>
					<div>
						<form:input path="t1total" />
					</div>
				</div>
				<div>
					<label for="team2">Team 2</label>
					<div>
						<form:input path="team2" />
					</div>
				</div>
				<div>
					<label for="t2period1">1</label>
					<div>
						<form:input path="t2period1" />
					</div>
				</div>
				<div>
					<label for="t2period2">2</label>
					<div>
						<form:input path="t2period2" />
					</div>
				</div>
				<div>
					<label for="t2period3">3</label>
					<div>
						<form:input path="t2period3" />
					</div>
				</div>
				<div>
					<label for="t2ot">OT</label>
					<div>
						<form:input path="t2ot" />
					</div>
				</div>
				<div>
					<label for="t2total">Total</label>
					<div>
						<form:input path="t2total" />
					</div>
				</div>
				<div>
					<form:button>Update</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>