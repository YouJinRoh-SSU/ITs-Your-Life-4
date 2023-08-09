package WS_0724;

public class Truck extends Vehicle {
	private int limitAmount;
	
	public Truck(int carNum, int rentPrice, String carType, int carAge, int gasAmount, int limitAmount) {
		super(carNum, rentPrice, carType, carAge, gasAmount);
		this.limitAmount = limitAmount;
	}

	public int getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(int limitAmount) {
		this.limitAmount = limitAmount;
	}

	@Override
	public String toString() {
		return super.toString() + ", limitAmount=" + limitAmount;
	}
}
