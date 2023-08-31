<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자맞추기</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#f1").submit(function(evt){
			//핸들러메서드가 false 반환시 원래행동을 못하게 막는것
			//원래행동 못하게 : 전송 기능 취소 => 화면이 Refresh됨(Ajax 동작 못함)
			// evt.preventDefault() //전송기능 취소
			sendNumber()
			return false //전송기능취소
		})
	})
	function sendNumber(){
		var n1 = $("#n1").val() //입력한 숫자 //id가 n1인
		var options = {
			url : "check_number.ng?no="+n1,
			success : function(data){
				$("#msg").html(data.msg)//id가 msg인 
			},
			error : function(){}
		}
		$.ajax(options)
	}
</script>
<body>
	<h1>숫자맞추기 게임</h1>
	<h3>1~100사이의 숫자를 맞춰보세요</h3>
	<form action="" id="f1">
		<fieldset>
			<legend>숫자입력</legend>
			<label>
				숫자 : <input id="n1" type="number" placeholder="1~100">
				<input type="submit" value="정답확인">
			</label>
		</fieldset>
	</form>
	<div id="msg"></div>
	
</body>
</html>