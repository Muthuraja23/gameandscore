<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin login</title>
<style>
   
<%@include file="css/login.css"%>
</style>
</head>
<body>
        <div class="app">
            <div class="bg"></div>
            <form action="loginValidation" method="post"
                modelAttribute="log" >
                <header>
                    <h1>Admin</h1>
                </header>
                <div class="inputs">
                    <input type="text" id="adminId" name="adminId"
                        placeholder="Admin ID"> <input type="password"
                        id="password" name="password" placeholder="Password">
                </div>
                <br> <br> <br> <br>
                <button type="submit" value="Login">Login</button>
            </form>
            <footer>
            <div style="color:red;">${message}</div>
            </footer>
        </div>
</body>
</html>