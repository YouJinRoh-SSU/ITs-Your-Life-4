<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정답입니다.</title>
</head>
<body>
<%
	String num = request.getParameter("num");
%>

	<h1><%=num %>정답입니다</h1>

</body>
</html>