<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert Form</title>
</head>
<body>
	<form action = "bookout.jsp" method = "post">
		제목 : <input type = "text" name = "title"><br>
		저자 : <input type = "text" name = "author"><br>
		출판사 : <input type = "text" name = "publisher"><br>
		<input type = "submit" value = "확인">
		
	</form>
</body>
</html>