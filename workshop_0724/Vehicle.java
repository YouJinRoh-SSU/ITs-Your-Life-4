package WS_0724;

public class Vehicle {
	private int carNum;
	private int rentPrice;
	private String carType;
	private int carAge, gasAmount;
	
	public Vehicle() {
		
	}

	public Vehicle(int carNum, int rentPrice, String carType, int carAge, int gasAmount) {
		super();
		this.carNum = carNum;
		this.rentPrice = rentPrice;
		this.carType = carType;
		this.carAge = carAge;
		this.gasAmount = gasAmount;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getCarAge() {
		return carAge;
	}

	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}

	public int getGasAmount() {
		return gasAmount;
	}

	public void setGasAmount(int gasAmount) {
		this.gasAmount = gasAmount;
	}

	@Override
	public String toString() {
		return "carNum=" + carNum + ", rentPrice=" + rentPrice + ", carType=" + carType + ", carAge=" + carAge
				+ ", gasAmount=" + gasAmount;
	}
}
