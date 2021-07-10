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
<h1>All MENUE LIST</h1>

	<c:if test="${!empty iceList}">

		<table border="1px">

			<tr>
				<th>Id</th>
				<th>Flavour</th>
				<th>price</th>
				<th>Edit</th>
				<th>Delete</th>

			</tr>

			<c:forEach items="${iceList}" var="l">

				<tr>
					<td>${l.id}</td>
					<td>${l.flavour}</td>
					<td>${l.price}</td>
					
					<td> <a href='<c:url value='/Ice/editIcecream/${l.id}' />'>edit</a> </td>
					<td> <a href='<c:url value='/Ice/deleteice/${l.id}' />'>delete</a> </td>
					
				</tr>

			</c:forEach>

		</table>



	</c:if>



</body>
</html>