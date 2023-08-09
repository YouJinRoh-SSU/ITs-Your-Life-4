package day_0725_1;

public class Review02 {
	int i;//멤버 변수 => null로 자동 초기화됨 
	public static void main(String[] args) {
		int i=0;//명시적 초기화 //지역 변수는 자동 초기화가 일어나지않음. 초기화 안한 선언 => 사용불가 
		System.out.println(i);
		String str;
		str = null;//첫번째로 값을 넣는것 => 초기화, 초기화를 해야 지역변수 사용 가능해짐 
		System.out.println(str);
	}

}
