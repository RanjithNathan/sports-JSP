<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sport Updation Form </title>
<link rel="stylesheet" href="registrationstyle.css">
<style>
   .reset{
   		    position: absolute;
            left: 620px;
            top: 390px;
           
    }
    
     .signin{
    		position: absolute;
            left: 580px;
            top: 430px;
            
          }
      .submit{
             position: absolute;
            left: 530px;
            top: 390px;    
            }
       .container
       {
       height:450px;
       }
      
     
</style>

</head>
<body>
		
    <div class="container">
        
            <h1>SPORTS UPDATE FORM</h1><hr>

        <form action="Update" method="post">
        
    <label for="">UserName</label> <input type="text" name="username" placeholder="enter player name"><br><br>
   <label for="">Password</label><input type="text" name="password" placeholder="enter username"><br><br>
   <label for="">Player Name</label> <input type="text" name="playername" placeholder="enter player name"><br><br>
   <label for=""> Sport Name</label><input type="text" name="sportname" placeholder="enter sport name"><br><br>
   <label for=""> College Name</label><input type="text" name="collegename" placeholder="enter College name"><br><br>
   <label for=""> City</label><input type="text" name="city" placeholder="enter city name"><br><br>
   <label for=""> Email</label><input type="text" name="Email" placeholder="enter  Email id"><br><br>
   <label for="">Mobile Number</label> <input type="text" name="mobile" id="" placeholder="enter mobilenumber "><br><br>
    </div>


                                    
   <input class="submit" type="submit" name="submit" value="Update" id="">
   <button class="reset"><a href="Updateform.jsp"> Reset</a> </button>
    
     <a class="signin" href="SportLogin.jsp">Sign-in</a>


    </form>
       
</body>
</html>