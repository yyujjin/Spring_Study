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
	
	<table border="1">
	<tr>
	<th>NO</th>
	<th>ID</th>
	<th>PW</th>
	<th>NAME</th>
	<th>AGE</th>
	</tr>

		<tr>
<!-- 		id는 고객이 알아야 할 사항이 안하니까 출력안하겠습니다.  -->
			<td width="400"><c:out value="${info.id}" /></td>
			<td  width="400"><c:out value="${info.userId}" /></td>
			<td  width="400"><c:out value="${info.userPw}" /></td>
			<td  width="400"><c:out value="${info.userName}" /></td>
			<td  width="400"><c:out value="${info.userAge}" /></td>
		</tr>
	</table> <br> <br>
	<a href="/member/main">메인화면으로 돌아가기</a>



</body>
</html>