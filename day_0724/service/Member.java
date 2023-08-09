package day_0724.service;

public class Member {
	private int id;//회원 번호

	public Member(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
	

}
