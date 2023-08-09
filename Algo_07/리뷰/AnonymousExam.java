package 리뷰;

public class AnonymousExam {
	public static void main(String[] args) {
		//일회용 임시 자식클래스 만드는 법
		A a = new A() { 
			int j = 100;
			public void p() {
				System.out.println("B" + j);
			};
		};//A를 상속한 이름없는 Anonymous 클래스 
		a.p();
		System.out.println(a.getClass() + a.getClass().getName());
		////////////////////
		MySwim ms = new MySwim() {//interface는 new 불가능 =>이름없이 정의한 후, interface 안에 메서드를 오버라이딩 해야함 : 인터페이스 타입으로 정의됨
			@Override
			public void swimming() {
				System.out.println("자유형 수영");	
			}
		};  
		System.out.println(ms.getClass().getName());
	}
}//end Anonymous
	
class A {
	public void p() {
		System.out.println("A");
	}
}
interface MySwim{
	void swimming();
}

class MySwimImpl implements MySwim{
	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		
	}
}


class B extends A{
	@Override
	public void p() {
		System.out.println("B");
	}
}


