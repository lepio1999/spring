<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.sh.login.domain.LoginDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@ page import="com.sh.kakaologin.domain.KakaoUserDTO"%>
<%@ page import="com.sh.saveUser.domain.UserDTO"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

	<h2>Welcome Page</h2>
	<%
	LoginDTO user = (LoginDTO) session.getAttribute("user");
	List<LoginDTO> selectedUser = (List<LoginDTO>) session.getAttribute("selectedUser");
    List<Object> chatList = (List<Object>) request.getAttribute("chatList"); // chatList 추가

	if ( user != null && selectedUser != null && !selectedUser.isEmpty()) {
		LoginDTO firstSelectedUser = selectedUser.get(0);
	%>
	<h2>
		Welcome,
		<%=firstSelectedUser.getUser_nickname()%></h2>
		
<form action="/testing/chattingList" method="post">
    <input type="text" name="buy_code" placeholder="채팅 코드 입력" value="<%=firstSelectedUser.getUser_code()%>">
    
    채팅하러 가기<button type="submit">${fn:length(chatList)}개</button>

    
</form>


    <% } %>
	<form action="/testing/myPage">
		<button type="submit">마이페이지이동</button>
	</form>

	<form action="/testing/scrollHome">
		<button type="submit">상품</button>
	</form>


	<form action="/testing/login">
		<button type="submit">가입 및 로그인</button>
	</form>

	<form action="/testing/showOrder">
		<button type="submit">주문내역</button>
	</form>


	<form action="/testing/logout" method="post">
		<button type="submit">로그아웃</button>
	</form>
	


</body>
</html>