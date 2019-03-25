<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br>
<h1>Welcome to Walmart Product List</h1>

<hr size="4" color="red"/>
<br>
<a href="mp">Go To Main Menu</a>
<br>
<br>

<table border="2" style="width: 50%;font-size: large;height: 40%">
	<tr style="background-color: lime;font-stretch: wider;">
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Product Price</td>
		<td>Product Company</td>
		<td>Update Product</td>
		<td>Delete Product</td>
	</tr>
<c:forEach var="pro" items="${allproduct}">
	<tr>
		<td>${pro.pid}</td>
		<td>${pro.pname}</td>
		<td>${pro.pprice}</td>
		<td>${pro.pcompany}</td>
		<td><a href='updateproduct/${pro.pid}'>Update</a></td>
		<td><a href='deleteproduct/${pro.pid}'>Delete</a></td>
	</tr>
</c:forEach>
</table>
<br>
<hr size="4" color="red"/>





</body>
</html>