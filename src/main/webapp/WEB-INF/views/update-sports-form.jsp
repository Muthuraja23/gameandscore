<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Update Sports Form</title>
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
            <form:form action="updatesports" method="post" modelAttribute="updatesports">
                <div>
                    <label for="sportsid">Sports id</label>
                    <div>
                        <form:input path="sportsid" />
                    </div>
                </div>
                <div>
                    <label for="sportsname">Sports Name</label>
                    <div>
                        <form:input path="sportsname" />
                    </div>
                </div>
                <div>
                    <label for="noofteamsparticipating">No.of_teams_Participating</label>
                    <div>
                        <form:input path="noofteamsparticipating" />
                    </div>
                </div>
                <div>
                    <form:button>Update Sports</form:button>
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>