package WS_0724;

public class SUV extends Vehicle {
	private int limitPerson, limitAmount;
	
	public SUV(int carNum, int rentPrice, String carType, int carAge, int gasAmount, int limitPerson, int limitAmount) {
		super(carNum, rentPrice, carType, carAge, gasAmount);
		this.limitPerson = limitPerson;
		this.limitAmount = limitAmount;
	}

	public int getLimitPerson() {
		return limitPerson;
	}

	public void setLimitPerson(int limitPerson) {
		this.limitPerson = limitPerson;
	}

	public int getLimitAmount() {
		return limitAmount;
	}

	public void setLimitAmount(int limitAmount) {
		this.limitAmount = limitAmount;
	}

	@Override
	public String toString() {
		return super.toString() + ", limitPerson=" + limitPerson + ", limitAmount=" + limitAmount;
	}
}
