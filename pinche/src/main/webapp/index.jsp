<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
		<script type="text/javascript" src="resources/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			function fun() {
				var json = {name:"xx"};
				$.get("man/test", json, function(result) {
					console.log(result);
				}, "json");
			}
		</script>
	</head> 
	<body>
		<c:url value="/showMessage.html" var="messageUrl" />
		<a href="${messageUrl}">Click to enter</a>
		<input type="button" value="test" onclick="fun()">
	</body>
</html>
