<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Registration</title>
</head>
<body>
    <h1>User Registration</h1>
    <form action="/saveUser" method="post">
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required><br>
        
        <label for="userPw">Password:</label>
        <input type="password" id="userPw" name="userPw" required><br>
        
        <label for="address">Address:</label>
        <input type="text" id="address" name="address"><br>
        
        <label for="phoneNum">Phone Number:</label>
        <input type="text" id="phoneNum" name="phoneNum"><br>
        
        <label for="memberPost">Member Post:</label>
        <input type="text" id="memberPost" name="memberPost"><br>
        
        <label for="memberAddr">Member Address:</label>
        <input type="text" id="memberAddr" name="memberAddr"><br>
        
        <label for="detailedAddress">Detailed Address:</label>
        <input type="text" id="detailedAddress" name="detailedAddress"><br>
        
        <label for="userBirth">User Birth:</label>
        <input type="text" id="userBirth" name="userBirth"><br>
        
        <label for="userNickname">User Nickname:</label>
        <input type="text" id="userNickname" name="userNickname"><br>
        
        <label for="userImage">User Image:</label>
        <input type="text" id="userImage" name="userImage"><br>
        
        <label for="userHeat">User Heat:</label>
        <input type="text" id="userHeat" name="userHeat"><br>
        
        <input type="submit" value="Register">
    </form>
</body>
</html>