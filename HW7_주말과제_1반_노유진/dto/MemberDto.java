package web0817mvc.dto;

public class MemberDto {
	private int no;
	private String name,email,phone;
	private int age;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int no, String name, String email, String phone, int age) {
		super();
		this.no = no;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDto [no=" + no + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age
				+ "]";
	}
	

	
}
