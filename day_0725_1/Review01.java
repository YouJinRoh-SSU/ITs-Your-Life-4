package day_0725_1;

public class Review01 {
	public static void main(String[] args) {
		int i = 100;
		long l = 200;//900경 크기 
		float f = l;//큰 숫자를 표현하기 위한 
		long l2 = (long)f;//큰데서 작은거 => 강제 형변환 
		//boolean b = (boolean)i; boolean은 숫자가 아니기 때문에 강제로 형변환이 안됨
		//객체와 숫자간의 직접적 형변환 불가능 
		//String s = (String)i; 직접적 형변환 불가능 
		//큰 타입 = 큰 타입 - 작은 타입;
		//int j = 1.0 + 2; 오류발생
		double j = 1.0 + 2;//1.0이 double 타입이니까
		
	}

}
