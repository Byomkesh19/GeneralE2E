<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.deewana.generale2e.model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<header style="background-color:#000080;color:red;font-family:'Courier New'">
<h1>Welcome to the Java Shop !!!</h1>
</header>

<div id="loginSection" style="max-width: 200px;
    margin: auto;
    left: 1%;
    right: 1%;
    position: absolute;">
    <h3>Available Products</h3>
<table border="5px">
<tr>
<th><label>Product ID</label></th>
<th><label>Product Name</label></th>
<th><label>Product Type</label></th>
<th><label>Company</label></th>
</tr>
<%
List<Product> products=(List<Product>)request.getAttribute("products");
for(Product product:products) {%>
<tr>
<td><%=product.getProductId()%></td>
<td><%=product.getProductName()%></td>
<td><%=product.getProductType()%></td>
<td><%=product.getCompany()%></td>
</tr>
<% }%>

</table>

</div>
<footer style="background-color:black;color:white;font-family:'Courier New';bottom:0;position:absolute;">
By Byomkesh Choudhary  &copy;
</footer>
</body>
</html>