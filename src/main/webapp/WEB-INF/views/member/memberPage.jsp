<<<<<<< Updated upstream
<%@page import="com.iu.s1.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <% 
   MemberDTO memberDTO  = (MemberDTO)request.getAttribute("dto");
   %>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
>>>>>>> Stashed changes
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<<<<<<< Updated upstream
	<h1>Member Page</h1>
	
	<h1><%= memberDTO.getEmail() %></h1>
=======

>>>>>>> Stashed changes
</body>
</html>