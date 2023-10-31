<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>이미지 업로드</title>
</head>
<body>
    <h2>이미지 업로드</h2>
    <form action="upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" accept="image/*">
        <input type="submit" value="업로드">
    </form>
    <p>${message}</p>
</body>
</html>