<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	function search() {

		$.ajax({
			type : "GET",
			url : "${pageContext.request.contextPath}/airList",
			success : function(data) {
				console.log(data);

				let result = toHTML(data);
				$("#result").html(result);
			},
			error : function(err) {
				console.log(err);
				alert("error");

			}
		});
	}

	function toHTML(d) {
		console.log(d);
		let str = "<ul>";
		for (let i = 0; i < d.length; i++) {
			let item = d[i];
			str += "<h2>" + item.informCause + "</h2>"+"<br>"+
					"발표 시간:  " + item.dataTime+"<br>"+ 
					"각 지역 날씨:  " + item.informGrade +"<br>";
		}
		str += "</ul>";
		return str;

	}
</script>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<button onclick="search()">air</button>
	<div id="result"></div>

</body>
</html>