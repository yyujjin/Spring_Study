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
	<c:forEach items="${info}" var="info">
		<tr>
			<td width="400"><c:out value="${info.id}" /></td>
			<td  width="400"><c:out value="${info.userId}" /></td>
			<td  width="400"><c:out value="${info.userPw}" /></td>
			<td  width="400"><c:out value="${info.userName}" /></td>
			<td  width="400"><c:out value="${info.userAge}" /></td>
		</tr>
	</c:forEach>
	</table> <br> <br>
	<a href="/member/main">메인화면으로 돌아가기</a>



</body>
</html>