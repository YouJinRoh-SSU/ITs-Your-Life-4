<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String result = (String)request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find_number_mvc.jsp</title>
</head>
<body>
	<h1>find_number_mvc.jsp</h1>
	결과 : <%= result %>
	
</body>
</html>