package day_05;

public class StringExam2 {
	public static void main(String[] args) {
		String s = "홍길동";
		String s2 = "멀티캠퍼스";		
		System.out.println(s.length());//문자열 길이
		System.out.println(s.charAt(1));//문자 추출 
		System.out.println(s.indexOf("홍"));//문자 추출 
		System.out.println(s.indexOf("캠"));//문자 추출 => 문자가 없을 경우 -1 
		System.out.println(s2.indexOf("캠퍼스"));//문자 추출
		System.out.println(s.startsWith("김")); //시작하는 글자 boolean 
		System.out.println(s.endsWith("동"));//끝나는 글자 boolean
		String s3 = "10,20,30";
		String[] split = s3.split(",");//문자열 배열로 반환해줌 
		System.out.println(split);
		String s4 = "abcd";
		String s5 = s4.toUpperCase();//대문자로 바꾸기
		System.out.println(s5 == s4);
		//String 은 불변 객체 : 한번 만들어진 후 내부값 변경 불가 
		//바꾸면 원래값이 변하는게 아니라 바뀐 새로운 객체가 저장되는 것 
		//따라서 문자열 변경 메서드 실행 결과로 새로운 문자열을 반환한다.
	}
}
