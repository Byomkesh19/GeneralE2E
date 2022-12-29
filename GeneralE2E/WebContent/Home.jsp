<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/format.css">
<style>
body {
  background-image: url('images/JavaBackground.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
  background-position: center
}
</style>
<title>Java Shop</title>
</head>
<body>
<header style="color:red;font-family:'Courier New'">
<h1>Welcome to the Java Shop !!!</h1>
</header>

<div id="loginSection" style="max-width: 200px;
    margin: auto;
    left: 1%;
    right: 1%;
    position: absolute;">
<form method="post"action="LoginServlet">
UserName : <input type="text" name="username"><br>
Password : <input type="password" name="password"><br>
<input type="Submit" name="submit"><br>
<b><a href="CreateAccount.jsp" style="color:#C70039;">Don't have an account. Click Here!</a></b>

</form>

</div>
<footer style="background-color:black;color:white;font-family:'Courier New';bottom:0;position:absolute;">
By Byomkesh Choudhary  &copy;
</footer>
</body>
</html>