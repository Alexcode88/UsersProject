<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form method="POST" action="/validateUser">
			<div>
				<label for="userFirstName"> First name: </label>
				<input type="text" id="userFirstName" name="userFirstName" />
			</div>
			<div>
				<label for="userLastName"> Last name: </label>
				<input type="text" id="userLastName" name="userLastName" />
			</div>
			<div>
				<button type="submit">
					Login
				</button>
			</div>
		</form>
		<div>
			<c:out value="${errorMessage}"> </c:out>
		</div>
	</body>
</html>