<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- 이게 무엇이지? -->
<!-- jstl을 사용하기 위한 라이브러리 추가 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 목록 페이지</h1>
	<!-- 제이쿼리 배워야할듯...? -->
	<!-- 아닌가 자바 문법인가 -->
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
			<td width="100"><c:out value="${list.id}" /></td>
			<td  width="100"><c:out value="${list.userId}" /></td>
			<td  width="100"><c:out value="${list.userPw}" /></td>
			<td  width="100"><c:out value="${list.userName}" /></td>
			<td  width="100"><c:out value="${list.userAge}" /></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>