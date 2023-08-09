package day_04;

public class Person {
	private String id, name;
	
	public Person() {//기본 생성자가 반드시 이ㅛ어야 자식 클래스엣 오류가 안남
		
	}


	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
