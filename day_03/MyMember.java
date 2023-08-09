package day_03;
/**
 * 회원정보 정의 클래스 
 */
public class MyMember {
	private String name; //변수에 대해 프라이빗은 기본적인 것.
	private int age;
	private String tel;
	
	//생성자 만들기 - 1. 기본 생성자, 2. 모든 변수를 매개변수로 받는 생성자
	public MyMember() { // 1. 기본 생성자
	}
	public MyMember(String name, int age, String tel) {//2. 모든 변수를 매개변수로 받는
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
	
	//Getter, Setter => private를 간접적으로 접근하기 위해
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//현재 객체의 변수 값을 문자열로 반환시키는 메소드 => 디버깅을 위해
	@Override
	public String toString() {
		return "MyMember [name=" + name + ", age=" + age + ", tel=" + tel + "]"; //System.out.println()은 웹이나 앱에 안나와서 문자열로 반환시킴 
	}
	
}
