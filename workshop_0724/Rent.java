package WS_0724;

public class Rent {
	private int rentNum, carNum, memberNum, rentPrice;
	private String startDate, startTime, endDate, endTime;
	
	public Rent() {
		
	}

	public Rent(int rentNum, int carNum, int memberNum, int rentPrice, String startDate, String startTime, String endDate, String endTime) {
		super();
		this.rentNum = rentNum;
		this.carNum = carNum;
		this.memberNum = memberNum;
		this.rentPrice = rentPrice;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endDate = endDate;
		this.endTime = endTime;
	}

	public int getRentNum() {
		return rentNum;
	}

	public void setRentNum(int rentNum) {
		this.rentNum = rentNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public int getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "rentNum=" + rentNum + ", carNum=" + carNum + ", memberNum=" + memberNum + ", rentPrice="
				+ rentPrice + ", startDate=" + startDate + ", startTime=" + startTime + ", endDate=" + endDate
				+ ", endTime=" + endTime;
	}
}
