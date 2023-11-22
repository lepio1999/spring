<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Chat 입력 폼</title>
</head>
<body>
    <form action="/testing/chatcode" method="post">
        Buy Code: <input type="text" name="buy_code"><br>
        Sell Code: <input type="text" name="sell_code"><br>
        <input type="submit" value="저장">
    </form>
</body>
</html>