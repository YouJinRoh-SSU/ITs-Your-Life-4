package day_0725_1;

public class Review03 {
	
	int i = 100;
	static int j = 200;
	
	public static void main(String[] args) {
		//System.out.println(i); i는 존재하지않음, static이라면 main 안에 i를 정의해줘야함 
		Review03 r = new Review03();
		System.out.println(r.i);
		System.out.println(j);//static
		System.out.println(Review03.j);
		System.out.println(Math.PI);
	}
	//메소드 오버로딩 : 이름은 같고, 매개변수가 다른것 
	//메소드 오버라이딩 : 이름 같고, 매개변수도 같음, 리턴 타입도 동일해야함, 자식타입도 동일해야함
	//매개변수 타입, 개수, 순서 
	//static이 있는지 없는지는 메소드 오버로딩에 영향 없음
	
}
