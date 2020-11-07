<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<title>게시판</title>
</head>
<body>
	<div class="container">
	<h2>상세보기</h2>
	<br/>
	<form action="update.do" method="post">
		
		<table class="table table-striped table-hover">
			<tr>
				<input type="hidden" value="${dto.no}" name="no">
				<th>no</th><td>${dto.no}</td>
				<th>writer</th><td>${dto.writer}</td>
			</tr>
			<tr>
				<th>title</th><td><input type="text" value="${dto.title}" name="title"></td>
				<th>content</th><td><input type="text" value="${dto.content}" name="content"></td>
			</tr>
			<tr>
				<th>regDate</th><td colspan="3">${dto.date}</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="submit" value ="글 수정">
					
					<input type="button" value ="글 삭제" onclick ="location.href='delete.do?no=${dto.no}'">
					<input type="button" value ="글 목록" onclick ="location.href='boardList.do'">
					<input type="button" value ="글 등록" onclick ="location.href='insertForm.do'">
				</td>
			</tr>
		</table><br><br>
	</form>
</div>
</body>
</html>