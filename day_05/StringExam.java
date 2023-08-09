package day_05;

public class StringExam {
	public static void main(String[] args) {
		System.out.println("a".compareTo("b")); //-1 : a가 b보다 먼저 
		//숫자보다 음수인지 양수인지 중요 
		
		//String 비교 
		String s1 = "abc"; //상수형태 문자열 => 메모리 메서드 영역에 존재
		String s2 = "abc";// 즉 s1, s2는 메서드에 같은 주소에 저장된 것 
		String s3 = new String("abc"); //s3, s4는 다른 주소를 가짐 . 힙과 스택에 저장되어있으므로
		String s4 = new String("abc"); 
		//==은 변수의 주솟값을 비교하는 것
		System.out.println(s1 == s2);//얘만 true 
		System.out.println(s3 == s4);
		System.out.println(s2 == s3);
		System.out.println(s1 == s4);
		//내부 문자열 비교 //주솟값 말고 내부의 문자열 값을 비교
		System.out.println("s3.equals(s4) == " + s3.equals(s4)); //true
		System.out.println("s1.equals(s4) == " + s1.equals(s4)); //true
	}
}

