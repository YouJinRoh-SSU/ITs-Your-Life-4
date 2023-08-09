package day_05;

import java.util.Objects;

//정렬시키는 애 따로 있고, 정렬 당하고 싶으면 implements Comparable<MyMember> 넣으면 됨
//정렬 순서 결정 => CompareTo 메서드가 비교해줌. 누가 앞인지 

public class MyMember implements Comparable<MyMember>{ //비교 대상 타입 
	private String name;//이름
	private int age;//나이
	
//생성자 2개 => 기본 생성자, 모든 변수를 받는 생성자 
	public static void main(String[] args) {
	}//기본 생성자
	public MyMember(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}//모든 변수를 받는 생성자 
	
//직접 접근이 불가능하기 때문에 간접 접근을 위한 getter와 setter	
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
	@Override
	public String toString() {
		return "MyMember [name=" + name + ", age=" + age + "]";
	}//변수의 현재값을 문자열로 반환해줌(디버깅용)
	
	
	@Override
	public int compareTo(MyMember o) {//Comparable인터페이스는 compareTo 메서드 정의 
		//나이 기준 정렬
		return this.age - o.getAge(); //음수가 반환되면 내가 앞
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyMember other = (MyMember) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	//equals 메서드 만들어줌 
	
	}//class

