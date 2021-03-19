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

	
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">WebSiteName</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="#">Home</a></li>
	      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
	        <ul class="dropdown-menu">
	          <li><a href="#">Page 1-1</a></li>
	          <li><a href="#">Page 1-2</a></li>
	          <li><a href="#">Page 1-3</a></li>
	        </ul>
	      </li>
	      <li><a href="./bankbook/bankbookList.do">BankBook</a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a href="./member/memberJoin.do"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
	      <li><a href="./member/memberLogin.do"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	    </ul>
	  </div>
	</nav>
	  
	  
	 <div class="container">
	   <div class="row">
	       <h1> BankBook Selected Page</h1>
	       
	       <table class="table table-hover">
	       	<thead>
	       		<tr> 
	       			<th>Name</th>
	       			<th>Rate</th>
	       			<th>Sale</th>
	       		</tr>
	       	</thead>
	       	
	       	
	       	<tbody>
	       	
	           
	       	     
	       		<tr>
	       			<td>${dto.bookname}</td>
	       			<td>${dto.bookrate}</td>
	       			<td>${dto.booksale}</td>
	       		</tr>
	       
				
	       	</tbody>
	       </table>
	       
	       
	       <a href ="./bankbookWrite.do" class="btn btn-danger">WRITE</a>
	       
	       
	    </div>
	  </div>

</body>
	
</body>
</html>