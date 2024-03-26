
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sport Login </title>
<link rel="stylesheet" href="loginstyle.css">
<style>
  a{
    position:absolute;
    left:330px;
    top:190px;
    }
</style>
</head>
<body>

 	<div class="container">
 	<h1>Log In</h1><hr>
				<form action="SportLogin" method="get">
	
	 	  <label for=""> USER NAME </label><input type="text" name="username" placeholder="enter player name"><br><br> 
       	  <label for=""> PASSWORD </label> <input type="password" name="password" placeholder="enter password"><br><br>
    	
               <input class="submit" type="submit" value="Log-in" id="">

 </form>
</div>
<a href="sportreg.jsp"> New Registration</a>

</body>
</html>