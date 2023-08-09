package day_03;

public class 회원관리 {

	public static void main(String[] args) {
//		MyMember m1=new MyMember("홍길동", 33, "111-222");
//		MyMember m1=new MyMember("김길동", 35, "111-333");
		MyMember[] mems = new MyMember[3]; //1개의 배열 객체가 만들어짐, null이 저장되어있음 
		mems[0] = new MyMember("홍길동", 33, "111-222");
		System.out.println(mems[0].toString());

	}

}
