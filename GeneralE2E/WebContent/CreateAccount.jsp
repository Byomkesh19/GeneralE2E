<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/format.css">

<title>Create Account In Java Shop</title>
</head>
<body style="background-color:#E6E6FA;">
<header style="color:red;font-family:'Courier New'">
<h1>Welcome to the Java Shop !!!</h1>
</header>
<div class="parent-center" id="createAccount">
<form method="post" action="CreateAccount">

Set Password : <input type="password" name="password"><br>
Name : <input type="text" name="name"><br>
Email ID : <input type="email" name="email"><br>
Contact Number : <input type="tel" name="phoneNumber"><br>
Gender : <label><input type="radio" name="gender" value="Male">Male</label>
<label><input type="radio" name="gender" value="Female">Female</label><br>

<input type="Submit" name="submit" >
</form>
</div>
<footer style="background-color:black;color:white;font-family:'Courier New';bottom:0;position:absolute;">
By Byomkesh Choudhary  &copy;
</footer>
</body>
</html>