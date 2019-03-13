<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script>
	$(function(){
// 		$("#login").on("click",function(){
// 			var userId = $("#userId").val();
// 			var userPw = $("#userPw").val();
// 			$.ajax({
// 				url:"login",
// 				data:{userId:userId,userPw:userPw},
// 				type:"post",
// 				success : function(data){
// 					alert(data);					
// 				}
// 			});
			
// 		});
// 		$("#logout").on("click",function(){
// 			$.ajax({
// 				url:"logout",
// 				type:"get"
// 			});
// 		});
		function login(){
			var form = document.getElementById("loginForm").value;
			form.submit();
		}
		function logout(){
			var form = document.getElementById("logout").value;
			form.submit();
		}
		function go(){
			var form = document.getElementById("goSns").value;
			form.submit();
		}
	});
	
</script>

<body>

	<c:if test="${sessionScope.loginId==null}">
	<form id="loginForm" action="login" method="post">
	<input type="text" name="userId" id="userId">
	<input type="text" name="userPw" id="userPw">
	<button onclick="javascript:login()">login</button>
	</form>
	</c:if>
	<c:if test="${sessionScope.loginId!=null}">
	<form id="logout" action="logout">
	<button onclick="javascript:logout()">logout</button>
	</form>
	<form action="goSns" id="goSns">
	<button onclick="javascript:go()">goSns</button>
	</form>
	</c:if>
	
</body>

</html>
