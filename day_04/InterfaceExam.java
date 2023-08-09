package day_04;

public class InterfaceExam {
	public static void main(String[] args) {
		//수영 동호회 구성
		//수영 가능한 사람만 모음
		//수영 가능을 어떻게 증명 => 수영하기() 라는 메서드가 있는 객체를 정의
		PersonSwim p1 = new PersonSwim("100","홍길동");
		Swimmable[] sma = new Swimmable[100];
		sma[0] = p1;
		//Swimmable sm = p1;
		//sm.swim();
		sma[0] = p1;
		sma[0].swim();
	}

}
//수영가능한지 확인 
//클래스는 명사, 메서드는 동사, 인터페이스는 형용사 
interface Swimmable{
	public void swim();//반드시 구현해야하는 메서드 정의
	
}

class PersonSwim extends Person implements Swimmable{
	
	public PersonSwim(String id, String name) {
		super(id, name);
	}
	
	
//unimplemented누르면 아래 코드 자동 
	@Override
	public void swim() {
		//반드시 메서드가 존재해야하기 때문에 오버라이딩해서 
		System.out.println("사람.페트병으로 수영");
	}
	//오버라이딩 
}
