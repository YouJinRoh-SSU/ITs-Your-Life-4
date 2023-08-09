package day_04;

public class Student extends Person{
	private String hakgwa;
		
	public Student() {
	}
	
	public Student(String hakgwa){
		super();
		this.hakgwa = hakgwa;
	}
	public Student(String id, String name, String hakgwa) {
		//setId(id);
		//setName(name);
		//super로 부모 클래스의 생성자 한번에 호출 가능
		super(id, name); //부모에 있는건 부모 클래스에서 한번에 가져오기
		this.hakgwa = hakgwa;//자기가 가지고있는건 자기가 가져오고
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}

	@Override
	public String toString() {
		return super.toString() + " , hakgwa= "+ hakgwa;
 	}


	
}
