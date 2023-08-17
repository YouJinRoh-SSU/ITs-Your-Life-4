<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath(); // "/web0816"이 반환됨 
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>get</title>
    <style>
      button{
        height: 26px
      }
    </style>
  </head>
  <body>

	<h4>By Link</h4>
	<a href="<%= contextPath %>/params?job=insert&pageNo=10&searchWord=bank">get link</a>
	
	<h4>By Button & JavaScript</h4>
	<button id="btnSendGet">Get 전송</button>
    <script>
    window.onload = function(){
    	
        // Get 전송 코드를 작성하세요.
        document.querySelector("#btnSendGet").onclick = function(){
          let job = "insert";
          let pageNo = "10";
          let searchWord = "bank";
          let params = `?job=${job}&pageNo=${pageNo}&searchWord=${searchWord}`;
          
          window.location.href = "<%= contextPath %>/params" + params;
        };

      };
    </script>
  </body>
</html>