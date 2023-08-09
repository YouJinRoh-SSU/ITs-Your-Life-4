package WS_0724;

public class Company extends Member {
	private String registerNum;
	
	public Company(int memberNum, String memberType, String memberName, String registerNum, String telNum) {
		super(memberNum, memberType, memberName, telNum);
		this.registerNum = registerNum;
	}
	
	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	@Override
	public String toString() {
		return super.toString() + "registerNum=" + registerNum;
	}
}
