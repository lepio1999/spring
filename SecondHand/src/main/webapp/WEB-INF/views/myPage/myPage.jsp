<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.sh.login.domain.LoginDTO"%>
<%@ page import="com.sh.product.domain.ProductDTO"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>마이페이지</title>
</head>
<body>

<h2>마이페이지</h2>
<%
List<ProductDTO> products = (List<ProductDTO>) session.getAttribute("products");
LoginDTO user = (LoginDTO) session.getAttribute("user");
List<LoginDTO> selectedUserList = (List<LoginDTO>) session.getAttribute("selectedUser");
ProductDTO selectedProduct = null;

if (user != null && selectedUserList != null && !selectedUserList.isEmpty()) {
    LoginDTO selectedUser = selectedUserList.get(0);
    
    if (products != null && !products.isEmpty()) {
        selectedProduct = products.get(0);
    }
%>
    <h2><%= selectedUser.getUser_nickname() %>:님</h2>
    
    <%
        if (selectedProduct != null) {
    %>
    <table style="border: 1px solid black;">
        <tr>
            <th>User Code</th>
            <th>User ID</th>
            <th>Password</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Member Post</th>
            <th>Member Address</th>
            <th>Detailed Address</th>
            <th>Birthdate</th>
            <th>Nickname</th>
            <th>User Image</th>
            <th>User Heat</th>
        </tr>
        <tr>
            <td><%= selectedUser.getUser_code() %></td>
            <td><%= selectedUser.getUser_id() %></td>
            <td><%= selectedUser.getUser_pw() %></td>
            <td><%= selectedUser.getAddress() %></td>
            <td><%= selectedUser.getPhone_num() %></td>
            <td><%= selectedUser.getMember_post() %></td>
            <td><%= selectedUser.getMember_addr() %></td>
            <td><%= selectedUser.getDetailed_address() %></td>
            <td><%= selectedUser.getUser_birth() %></td>
            <td><%= selectedUser.getUser_nickname() %></td>
            <td><%= selectedUser.getUser_image() %></td>
            <td><%= selectedUser.getUser_heat() %></td>
        </tr>
    </table>
     
   유저코드 <p><%= selectedUser.getUser_code() %></p>
    상품 코드<p><%= selectedProduct.getBoard_Id() %></p>
    상품유저코드<p><%= selectedProduct.getUser_code() %></p>
    <form action="/testing/chatting.jsp">
        <button type="submit">채팅</button>
    </form>
    
    <%
        } else {
        	
    %>
        <table style="border: 1px solid black;">
        <tr>
            <th>User Code</th>
            <th>User ID</th>
            <th>Password</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Member Post</th>
            <th>Member Address</th>
            <th>Detailed Address</th>
            <th>Birthdate</th>
            <th>Nickname</th>
            <th>User Image</th>
            <th>User Heat</th>
        </tr>
        <tr>
            <td><%= selectedUser.getUser_code() %></td>
            <td><%= selectedUser.getUser_id() %></td>
            <td><%= selectedUser.getUser_pw() %></td>
            <td><%= selectedUser.getAddress() %></td>
            <td><%= selectedUser.getPhone_num() %></td>
            <td><%= selectedUser.getMember_post() %></td>
            <td><%= selectedUser.getMember_addr() %></td>
            <td><%= selectedUser.getDetailed_address() %></td>
            <td><%= selectedUser.getUser_birth() %></td>
            <td><%= selectedUser.getUser_nickname() %></td>
            <td><%= selectedUser.getUser_image() %></td>
            <td><%= selectedUser.getUser_heat() %></td>
        </tr>
    </table>
    <p>선택한 제품이 없습니다.</p>
    <%
        }
    %>
<%
}
%>

<form action="/testing/update">
    <button type="submit">정보수정하기</button>
</form>

<form action="/testing/homePage">
    <button type="submit">메인</button>
</form>

<form action="/testing/deleteUser">
    <button type="submit">회원삭제</button>
</form>

</body>
</html>