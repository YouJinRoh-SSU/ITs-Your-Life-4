<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Map<String, String> map = (Map<String, String>) request.getAttribute("map");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Get Result</h1>
<%
	for( String key : map.keySet() ){
%>
	<h1><%=key %> : <%= map.get(key)%></h1>
<%	
	}
%>		
	</body>
</html>