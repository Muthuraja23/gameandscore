<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<style type="text/css">
* {
	background-color: gray;
	text-align: center;
}
<%@include file="css/form.css"%>
</style>
</head>
<body>
	<h1>Game</h1>
	<a href="/game/addform"><button>Add</button></a>

	<form action="/game/updateform">
		<div class="center">
			<input type="text" name="gameid" /> <br>
			<button>Update</button>
		</div>
	</form>

	<form action="/game/deletegame">
		<div class="center">
			<input type="text" name="gameid" /> <br>
			<button>Delete</button>
		</div>
	</form>

	<h1>Cricket</h1>
	<h2>ScoreBoard</h2>
	<br>
	<a href="/cricket/addscore"><button>Add</button></a>
	<form action="/cricket/updatescore">
		<div class="center">
			<input type="text" name="crscoreboardid" /> <br>
			<button>Update</button>
		</div>
	</form>

	<form action="/cricket/deletescore">
		<div class="center">
			<input type="text" name="crscoreboardid" /> <br>
			<button>Delete</button>
		</div>
	</form>

	<h2>Batting</h2>
	<br>
	<a href="/batting/addbatting"><button>Add</button></a>
	<form action="/batting/updatebatting">
		<div class="center">
			<input type="text" name="crbattingid" /> <br>
			<button>Update</button>
		</div>
	</form>

	<form action="/batting/deletebatting">
		<div class="center">
			<input type="text" name="crbattingid" /> <br>
			<button>Delete</button>
		</div>
	</form>

	<h2>Bowling</h2>
	<br>

	<a href="/bowling/addbowling"><button>Add</button></a>
	<form action="/bowling/updatebowling">
		<div class="center">
			<input type="text" name="crbowlingid" /> <br>
			<button>Update</button>
		</div>
	</form>

	<form action="/bowling/deletebowling">
		<div class="center">
			<input type="text" name="crbowlingid" /> <br>
			<button>Delete</button>
		</div>
	</form>

	<h1>Football</h1>
	<br>
	<h2>ScoreBoard</h2>
	<a href="/football/addform"><button>Add</button></a>
	<form action="/football/updatescore">
		<div class="center">
			<input type="text" name="fbscoreboardid" /> <br>
			<button>Update</button>
		</div>
	</form>

	<form action="/football/deletescore">
		<div class="center">
			<input type="text" name="fbscoreboardid" /> <br>
			<button>Delete</button>
		</div>
	</form>
	<h2>Stats</h2>
	<a href="/fbgoals/addform"><button>Add</button></a>
	<form action="/fbgoals/updateform">
		<div class="center">
			<input type="text" name="fbgoalsid" /> <br>
			<button>Update</button>
		</div>
	</form>

	<form action="/fbgoals/deletegoal">
		<div class="center">
			<input type="text" name="fbgoalsid" /> <br>
			<button>Delete</button>
		</div>
	</form>	
	
	<h1>Hockey</h1><br>
	<h2>ScoreBoard</h2>
	<a href="/hockey/addform"><button>Add</button></a>
	<form action="/hockey/updatescore">
		<div class="center">
			<input type="text" name="hscoreboardid" /> <br>
			<button>Update</button>
		</div>
	</form>

	<form action="/hockey/deletescore">
		<div class="center">
			<input type="text" name="hscoreboardid" /> <br>
			<button>Delete</button>
		</div>
	</form>
	<h2>Stats</h2>
	<a href="/hgoals/addform"><button>Add</button></a>
	<form action="/hgoals/updateform">
		<div class="center">
			<input type="text" name="hgoalsid" /> <br>
			<button>Update</button>
		</div>
	</form>

	<form action="/hgoals/deletegoal">
		<div class="center">
			<input type="text" name="hgoalsid" /> <br>
			<button>Delete</button>
		</div>
	</form>
</body>
</html>