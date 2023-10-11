<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="item" items="${list}">
		<h2>${item.title}</h2>
		<img src="${item.image}" style="width: 500px">
		<br>
		<a href="${item.link}">${item.link}</a>
		<h3>${item.lprice}원</h3>
	</c:forEach>

</body>
</html>