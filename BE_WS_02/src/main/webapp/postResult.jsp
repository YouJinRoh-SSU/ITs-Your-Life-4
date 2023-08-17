<%@page import="BE_WS_02.dto.ParameterDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ParameterDto parameterDto = (ParameterDto) request.getAttribute("parameterDto");

	StringBuilder sbHobby = new StringBuilder();
	for (String h : parameterDto.getHobby()) {
		sbHobby.append(h).append(", ");
	}
	sbHobby.setLength(sbHobby.length()-2);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Post Result</h1>
		<table>
			<tr><td>name</td><td><%= parameterDto.getName() %></td></tr>
			<tr><td>email</td><td><%= parameterDto.getEmail() %></td></tr>
			<tr><td>gender</td><td><%= parameterDto.getGender() %></td></tr>
			<tr><td>hobby</td><td><%= sbHobby %></td></tr>
			<tr><td>favorite</td><td><%= parameterDto.getFavorite() %></td></tr>
			<tr><td>desc</td><td><%= parameterDto.getDesc() %></td></tr>
		
		</table>		
	</body>
</html>