<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	       <h1> BankBook Selected Page</h1>
	       <c:if test="${empty dto}">
	       	<h3> 상품이 없습니다 </h3>
	       </c:if>
	       <h3>${dto.bookname}</h3>
	       <h3>${dto.bookrate}</h3>
	       <h3>${dto.booksale}</h3>
	       
	       
	       

	
</body>
</html>