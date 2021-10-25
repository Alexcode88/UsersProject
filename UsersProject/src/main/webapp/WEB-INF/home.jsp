<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>
			Welcome back <c:out value="${fullName}"></c:out>!
		</h1>
		<h2>
			Your identifier is: <c:out value="${identifier}"></c:out>
		</h2>
		
		<form method = "POST" action = "/logout">
			<button type="submit">
				Logout
			</button>
		</form>
	</body>
</html>