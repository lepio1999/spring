<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Carrot</title>
</head>
<body>
	<h2>Update Carrot</h2>

	<form action="/day2/update" method="post">
		<input type="text" name="id" value="${param.id}">
		<input type="text" name="price" value="${param.price}"> 
		<input type="text" name="info" value="${param.info}" placeholder="새로운 정보">
		<button type="submit">수정하기</button>
	</form>
	<form action="/day2/select">
	<button>홈으로</button>
	</form>


</body>
</html>