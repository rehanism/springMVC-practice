<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

<%
/* String name=(String)request.getAttribute("name");
 //*///Integer rollno=(Integer) request.getAttribute("rollno");
//LocalDateTime time =(LocalDateTime) request.getAttribute("time");


%> 

<h1>Hello My name is ${name}<%-- <%= name %> --%>
</h1>
<h1>roll no is ${rollno}<%-- <%= rollno %> --%></h1>
<h1>Date and time is  ${time}<%-- <%= time %> --%></h1>
<hr>
<h1>Marks are ${marks}</h1>
<c:forEach var="item" items="${marks} }">
	<%-- <h1>${item}</h1> --%>
	<h1><c:out value="${item }"></c:out></h1>

</c:forEach>

</body>
</html>