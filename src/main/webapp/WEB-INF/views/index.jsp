<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	
	<%
		String name = (String) request.getAttribute("name");
		Integer id =(Integer) request.getAttribute("id");
		List<String> friends =(List<String>) request.getAttribute("friends");
	%>
	<h1>name <%=name %> id <%=id %></h1>

</body>
</html>