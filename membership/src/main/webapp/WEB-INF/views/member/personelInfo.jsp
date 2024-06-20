<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 수정 페이지</h1>

	<form action="/member/updatePersonelInfo" method="post">
		<table border="1">
			<tr>
				<th>ID</th>
				<th>PW</th>
				<th>NAME</th>
				<th>AGE</th>
			</tr>

			<tr>
<!-- 				input value는 초기값을 말함 -->
				<!-- 				c태그 value도 값을 화면에 보이는거 -->
				<!-- 2개 합치기 -->
				<!-- 쌍따옴표 겹치니까 하나 따옴표로 만들어주기!! -->
				<td width="400"><input type="text" name="userId"
					value="<c:out value='${info.userId}' />"></td>
				<td width="400"><input type="text" name="userPw"
					value="<c:out value='${info.userPw}' />"></td>
				<td width="400"><input type="text" name="userName"
					value="<c:out value='${info.userName}' />"></td>
				<td width="400"><input type="text" name="userAge"
					value="<c:out value='${info.userAge}' />"></td>
			</tr>
		</table>
		<input type="hidden" name="id" value="<c:out value='${info.id}' />">
		<button type="submit">수정하기</button>
		<a href="/member/deleteInfo?id=${info.id}"><button type="button">삭제하기</button></a>
		
	</form>
	<br>
	<br>
	<a href="/member/main">메인화면으로 돌아가기</a>



</body>
</html>