<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<title>로그인 폼</title>
</head>
<body>
		<div class = "container justify-content-center bg-primary text-white">
		<h1>로그인</h1>
		</div>
		<div class = "container justify-content-center">
		<!-- session에 저장 된 값이 없으면 로그인 폼 출력 -->
		<%if(session.getAttribute("id") == null){%>
		<form action = "loginCheck" method = "post">
			<p>아이디 <input type = "text" name = "id"></p>
			<p>패스워드 <input type = "password" name = "pw"></p>
			<input type = "submit" value = "Login" class = "btn btn-warning">
		</form>
		<!-- session에 값이 있을때의 폼 -->
		<%} else {%>
		<form action = "logOut" method = "post">	
			<%=session.getAttribute("id") %>님 반갑습니다.
			<input type = "submit" value = "로그아웃">
		</form>
		<%} %>
		</div>
</body>
</html>