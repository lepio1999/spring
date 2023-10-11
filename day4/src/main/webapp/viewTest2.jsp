<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script >
function search() {
	
	$.ajax(
			{
				type:"GET",
				url: "/day4/naverList3",
				dataType:"json",
				success:function(data){
					let result = naver(data);
					$("#result").html(result);
					},
					error:function(){
						alert("error");
					}
				}
			
			);
			}
	
	function naver(items) {
		
		console.log(items);
		var itemListHTML="";
		
		
		$.each(items, function(index,item){
			itemListHTML += "<h2>" +item.title+ "</h2>";
			itemListHTML += "<img src='"+item.image +"'style='width: 500px;'>";
			itemListHTML += "<a href='" +item.link+"'>link</a>";
			itemListHTML += "<h3>" +item.lprice+ "</h3>";

		});
		
		return itemListHTML;
		
	}
	
	


</script>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <button  onclick="search()">조회</button>
 <div id="result"></div>



</body>
</html>