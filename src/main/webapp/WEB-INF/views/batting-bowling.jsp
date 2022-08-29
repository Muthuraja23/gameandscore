<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Batting/Bowling</title>
<style>
*{
	text-align:center;
}
</style>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<a href="/batting/addbatting?id=${id}&playerId=${playerId}"><button>Batting</button></a>
	<a href="/bowling/addbowling?id=${id}&playerId=${playerId}"><button>Bowling</button></a>
</body>
</html>