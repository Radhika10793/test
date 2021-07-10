<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Emp Registration</h1>

	<c:url value="/Ice/saveIce" var="saveIce" />

	<form:form action="${saveIce}" method="post" modelAttribute="icecream">
	
	<table border="1px">

	<tr>
	<td>Flavour</td>
	<td> <form:input path="Flavour"/> </td>
	</tr>
	
	<tr>
	<td>Price</td>
	<td> <form:input path="price"/> </td>
	</tr>
	
	<tr>
	<td> <input type="submit" value="Save"></td>
		
	</tr>
	
	</table>
	
</form:form>


</body>
</html>