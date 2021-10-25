<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="./css/index.css"/>
	</head>
	<body>
		<h1>
			Hello there from the JSP file!
		</h1>
		<h2>
			Welcome back <c:out value="${firstName}"></c:out>!
		</h2>
		<ul>
			<c:forEach var="user" items="${userList}">
			<li>
				<c:out value="${user.getFirstName()}"></c:out>
				<c:out value="${user.getLastName()}"></c:out>
				<c:out value="${user.getIdentifier()}"></c:out>
			</li>
			</c:forEach>
		</ul>
	</body>
</html>

