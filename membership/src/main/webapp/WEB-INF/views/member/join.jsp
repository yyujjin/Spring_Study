<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 등록</h1>
	<!-- html에서 form 데이터 넘기는 법  -->
	<form action="/member/join" method="post">
	아이디 : <input type="text" name=userId><br>
	비밀 번호<input type="password" name=userPw><br>
	이름 : <input type="text" name="userName"><br>
	나이 : <input type="text" name="userAge"> 
		<button type="submit">제출하기</button>
	</form>

</body>
</html>