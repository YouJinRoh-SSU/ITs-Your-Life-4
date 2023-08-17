<%@page import="java.util.HashSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.TreeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	private TreeSet<Integer> lotto = new TreeSet<Integer>();//Hashset은 중복배제,정렬X
	//public void prn(){}같은 함수를 만들려면!안에다 써야함
	//public void _jspInit(){
	//	System.out.println("**JSP INIT**");}//jsp lifecycle에 해당하는 함수
	public void prn(){
		System.out.println("헬로");
	}
%>

<% //스크립트릿
	
	for( ;lotto.size()<6; ){
		int r = new java.util.Random().nextInt(45)+1;
		lotto.add(r);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또 번호 추천 JSP</title>
</head>
<body>
	<h1>오늘의 로또번호</h1>
	<h2><%= lotto %></h2>
	<h2><%= prn() %></h2>

</body>
</html>