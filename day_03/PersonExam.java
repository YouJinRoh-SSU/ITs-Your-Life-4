package day_03;

public class PersonExam {
//클래스 밖에서는 변수를 선언할 수 없음.변수는 반드시 클래스나 메소드 안에서 선언 가능.
	public static void main(String[] args) {
		Person p1 = new Person("김길동", 33);
		//변수 선언(변수 생성) => 애네는 지역변수로 스택에 생성됨 
		//지역변수는 메서그코드 종료 시 삭제됨 
		//김길동이 원래의 초기값 홍길동을 덮음
		p1.printInfo();
		
		
		System.out.println(p1.name);

		
		Person p2 = new Person("박길동",40);
		p2.printInfo();
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		Person p3 = new Person(35,"강길동");
		p3.printInfo();
		System.out.println(p3.age);
		System.out.println(p3.name);

	}

}
