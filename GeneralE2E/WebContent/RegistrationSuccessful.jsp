<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/format.css">

<title>Java Shop</title>

</head>
<body style="background-color:#E6E6FA;">
<header style="color:red;font-family:'Courier New'">
<h1>Welcome to the Java Shop !!!</h1>
</header>
<div items="${name}" var="name">
<h2>Congratulations ${name} . You are successfully registered in the Java Shop!!!</h2>
<div items="${user}" var="user">
<br>
<h2>Your user id is ${user}.</h2>
</div>
</div>
<div class="parent-center">
<h2><a href="Home.jsp">Click Here To Go To Home Page</a></h2>
</div>
<footer style="background-color:black;color:white;font-family:'Courier New';bottom:0;position:absolute;">
By Byomkesh Choudhary  &copy;
</footer>
</body>
</html>