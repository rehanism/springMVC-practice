<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Successful</title>
</head>
<body>
	<div class="container mt-5">
	<div class="container text-center">
		<h3>${Header }</h3>
		<h4>${Description }</h4>
	</div>
	</div>
	<hr>
	<h3>Registration Successful</h3>
	<h1>Your Credentials are</h1>
	<h1>username : ${user.username }</h1>
	<h1>Email : ${user.email }</h1>

</body>
</html>