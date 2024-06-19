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
	<th>NO.</th>
	<th>ID</th>
	<th>PW</th>
	<th>NAME</th>
	<th>AGE</th>
	</tr>
	<c:forEach items="${list}" var="list">
		<tr>
			<td width="400"><c:out value="${list.id}" /></td>
			<td  width="400"><c:out value="${list.userId}" /></td>
			<td  width="400"><c:out value="${list.userPw}" /></td>
			<td  width="400"><c:out value="${list.userName}" /></td>
			<td  width="400"><c:out value="${list.userAge}" /></td>
		</tr>
	</c:forEach>
	</table> <br> <br>
	<a href="/member/main">메인화면으로 돌아가기</a>



</body>
</html>