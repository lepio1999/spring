<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>


<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>

<script >
function register() {
//	alert("iojosdkjo");
	let name = $("#name").val();
	let actor = $("#actor").val();
	alert (name);
	alert(actor);
	
	let drama = {name:name,actor: actor};
	let dramas = JSON.stringify(drama);
	alert(dramas);
	console.log(dramas);
	console.log(drama);
	
	$.ajax({
		type:"put",
		url: "/day2/drama",
		data: dramas,
		contentType: "application/json", // 필수값..!!!
		success : function(data) {
			alert(data);
		},
		error: function () {
			alert("error");
		}
	});
	
}
</script>
</head>
<body>
<input type="text" id=name>
<input type="text" id="actor">
<button onclick="register()">변경</button>
</body>
</html>