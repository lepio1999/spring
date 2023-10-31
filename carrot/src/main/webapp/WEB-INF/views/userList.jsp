<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.carrot.sign.User" %>


<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h1>User List</h1>
    <table border="1">
        <tr>
            <th>User Code</th>
            <th>User ID</th>
            <th>User Password</th>
        </tr>
        <c:forEach var="users" items="${users}" >
            <tr>
                <td>${users.user_code}</td>
                <td>${users.user_id}</td>
                <td>${users.user_pw}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
