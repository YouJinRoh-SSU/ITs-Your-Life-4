package day_03;

public class MyInfo {
	
	private int age; //같은 클래스 내부에서만 접근 가능 //범위
	
	public int getAge() {//이 메서드의 시점은 외부 
		return this.age; //위 private라 뽑지 못했던 age를 뽑아줌 
		//age를 외부에서 가져갈 수 있도록 
	}
	public void setAge(int age) {
		this.age = age; //age를 외부에서 값을 넣어줄 수 있도록
	}
	
	int age2; //접근 제어자 생략 시 => defalut라 칭함 defalut 는 같은 패키지에서 접근 가능

}
