<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang=en>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<style type="text/css">

</style>
</head>
<body>
	<h1>Game</h1>
	<a href="/game/addform"><button> Add</button></a>
	
	<form action="/game/updateform">
            <div class="center">
                <input type="text" name="gameid" /> <input type="submit"
                    value="update" />
            </div>
        </form>
        
        <form action="/game/deletegame">
            <div class="center">
                <input type="text" name="gameid" /> <input type="submit"
                    value="delete" />
            </div>
        </form>
	
	<h1>Cricket</h1>
		<h1>ScoreBoard</h1><br>
		<a href="/cricket/addscore"><button> Add</button></a>
		<form action="/cricket/updatescore">
            <div class="center">
                <input type="text" name="crscoreboardid" /> <input type="submit"
                    value="update" />
            </div>
        </form>
        
        <form action="/cricket/deletescore">
            <div class="center">
                <input type="text" name="crscoreboardid" /> <input type="submit"
                    value="delete" />
            </div>
            </form>
            
	<h1>Football</h1><br>
	
	<h1>Hockey</h1>
	
</body>
</html>