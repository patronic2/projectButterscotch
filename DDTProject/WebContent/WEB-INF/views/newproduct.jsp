<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<br>
	<h1>New Product Entry</h1>
	<br>
	<hr size="4" color="red"/>
	
	<form:form action="registerNewProduct">
		<form:input path="pid"/>
		<form:input path="pname"/>
		<form:input path="pprice"/>
		<form:input path="pcompany"/>
		<form:button>Insert</form:button>
	</form:form>
	
	
	
<!-- 	
	<form action="registerNewProduct">
		<input type="text" name="pname" required/>
		<input type="number" name="pprice" required/>
		<input type="text" name="pcompany" required/>
		<input type="submit" value="New Product Entry"/>
	</form>
 -->
 
	<br>
	
	<hr size="4" color="red"/>

</body>
</html>