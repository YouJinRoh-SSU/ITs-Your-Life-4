package day_03;
//public 클래스는 파일명과 클래스명이 반드시 동일해야함 person=person 
//public를 빼면 class이름이 파일명과 달라도 됨
//public 클래스는 1개만 가능, 그 안에 그냥 클래스는 여러개 더 가능
//타입 필드면[=초기값]; 초기값은 선택사항 
//필드는 객체 생성 시 자동 초기화
//0이 false, 1은
//접근지정자 
public class Person{
	String name="홍길동"; //필드 객체 //name =>생성할 때 객체 영역에 생성
	int age=30;
	
//기본 생성자를 컴파일러가 추가
//	public Person() {		
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

	//생성자 선언해주기 	
	public Person(String name, int age){
		this.name=name;
		this.age=age; //멤버변수, 실제로 저장하는 곳? 
		//this는 객체의 참조값을 가지고 있는 내장변수 
		//this 하면 Person의 p1이 가지고
	}
	//생성자가 없는 Person 만들기
	//이름 같고 생성자가 다른 것 : 오버 로딩 
	public Person(int age, String name) {
		//System.out.println(); this보다 먼저있으면 에러-this call이 첫번째 문장이어야함
		this(name, age);//위에 있는 생성자 name, age를 부름 
		//this(age,name)하면 에러뜸. 자기자신을 계속 부르기 때문
		
	}
	/** 내부 변수 값을 출력해줌 */
	public void printInfo() {
		System.out.println("name: "+ name+ " age: "+age);//로커변수를 찾아보고, 없으면 맨 위에 name이랑 age로, this를 붙여도 되지만 안붙여도 맨위로 감 
		return ;
	}
	
}

/*public Person(String name, int age){
	name=name; 가장 가까운 블록 내에서 선언되므로 매개변수 name, age를 선언해도 갱신이 안됨  
	age=age;
}

this.name = name;
this.age=age;  로 바꿔야함 
**/


