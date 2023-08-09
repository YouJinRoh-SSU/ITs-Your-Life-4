package WS_0724;

public class Member {
	private int memberNum;
	private String memberType, memberName, telNum;
	
	public Member() {
		
	}

	public Member(int memberNum, String memberType, String memberName, String telNum) {
		super();
		this.memberNum = memberNum;
		this.memberType = memberType;
		this.memberName = memberName;
		this.telNum = telNum;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	@Override
	public String toString() {
		return "memberNum=" + memberNum + ", memberType=" + memberType + ", memberName=" + memberName
				+ ", telNum=" + telNum;
	}
}
