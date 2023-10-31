<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.sh.login.LoginDTO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.sh.kakaologin.KakaoUserDTO"%>
<%@ page import="com.sh.saveUser.UserDTO"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	<script>function kakaoLogout() {
        if (Kakao.Auth.getAccessToken()) {
            Kakao.API.request({
              url: "/v1/user/unlink",
              success: function (response) {
                logout();
                console.log(response);
              },
              fail: function (error) {
                console.log(error);
              },
            });
            Kakao.Auth.setAccessToken(undefined);
          }
        }
     
      </script>
	<script>
function logout() {
    fetch('/invalidateSession', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        }
    })
    .then(response => response.text())
    .then(data => {
        alert(data); // 서버에서 보낸 메시지를 알림창으로 표시
        location.reload(); // 페이지 새로고침
    })
    .catch(error => console.error('Error:', error));
}
</script>
	<h2>Welcome Page</h2>
	<%
	LoginDTO user = (LoginDTO) session.getAttribute("user");
	List<LoginDTO> selectedUser = (List<LoginDTO>) session.getAttribute("selectedUser");
	if (user != null && selectedUser != null && !selectedUser.isEmpty()) {
		LoginDTO firstSelectedUser = selectedUser.get(0); // Assuming you want the first user in the list
	%>
	<h2>
		Welcome,
		<%=firstSelectedUser.getUser_nickname()%></h2>
	<%
	}
	%>
	<form action="/testing/myPage">
		<button type="submit">마이페이지이동</button>
	</form>

	<form action="/testing/products">
		<button type="submit">상품</button>
	</form>

	<form action="/testing/login">
		<button type="submit">가입 및 로그인</button>
	</form>
	<form id="logoutForm">
		<button type="submit" onclick="logout()"> <span>카카오 로그아웃</span></button>
	</form>
</body>
</html>