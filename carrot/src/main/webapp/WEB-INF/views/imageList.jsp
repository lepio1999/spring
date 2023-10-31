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
	<h2>Image List</h2>
	<ul>
		<c:forEach items="${imageNames}" var="imageName">
			<li><a href="/download?name=${imageName}">${imageName}</a></li>
		</c:forEach>
	</ul>

</body>
</html>