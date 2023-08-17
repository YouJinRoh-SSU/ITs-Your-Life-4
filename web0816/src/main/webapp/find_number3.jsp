<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!//!잇으면 멤버변수, 최초의 한번 설정해줌
	//컴퓨터 난수
	int com_num = new java.util.Random().nextInt(100)+1;
%>

<%//!이 없으면 로컬변수 
	String num = request.getParameter("num");
	int i = Integer.parseInt(num);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자맞추기 게임 결과</title>
</head>
<body>
<%
	String url = "";
	if(com_num == i){
		url="find_number_right.jsp";
	}else if(com_num < i){
		url="find_number_down.jsp";
	}else{
		url="find_number_up.jsp";
	}
	//Redirect
	response.sendRedirect(url);
%>

</body>
</html>