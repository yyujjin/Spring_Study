<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>테스트 페이지 입니다.</h1>
	<form method="post" action="member/test">
		<fieldset>Book</fieldset>
			<label>책 제목</label> <input type="text" name="title"placeholder="책 제목을 입력해주세요." />
			<label>작가 이름</label> <input type="text" name="author" placeholder="작가 이름을 넣어주세요." />
			<label>추가 설명</label> <input type="text" name="comment" placeholder="추가 설명을 넣어주세요." /> <br />
			<button type="submit" class="btn">추가</button>
	</form>
</body>
</html>