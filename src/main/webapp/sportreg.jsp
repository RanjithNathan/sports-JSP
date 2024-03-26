<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sport Registration Form </title>
<link rel="stylesheet" href="registrationstyle.css">

</head>
<body>

    <div class="container">
        
            <h1>SPORTS REGISTRATION FORM</h1><hr>

        <form action="Register" method="post">
    
   <label for="">Player Name</label> <input type="text" name="playername" placeholder="enter player name"><br><br>
   <label for="">User Name</label><input type="text" name="username" placeholder="enter username"><br><br>
   <label for=""> Password</label> <input type="password" name="password" placeholder="enter password"><br><br>
   <label for=""> Sport Name</label><input type="text" name="sportname" placeholder="enter sport name"><br><br>
   <label for="">Mobile Number</label> <input type="text" name="mobile" id="" placeholder="enter mobilenumb "><br><br>
    </div>


                                    
   <input class="submit" type="submit" name="submit" value="submit" id="">
   <button class="reset"><a href="sportreg.jsp"> Reset</a> </button>
    
     <p>☞</p> <a class="signin" href="SportLogin.jsp">Sign-in</a>


    </form>
       
</body>
</html>