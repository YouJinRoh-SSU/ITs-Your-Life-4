package WS_0724;

public class Bus extends Vehicle {
	private int limitPerson;
	
	public Bus(int carNum, int rentPrice, String carType, int carAge, int gasAmount, int limitPerson) {
		super(carNum, rentPrice, carType, carAge, gasAmount);
		this.limitPerson = limitPerson;
	}

	public int getLimitPerson() {
		return limitPerson;
	}

	public void setLimitPerson(int limitPerson) {
		this.limitPerson = limitPerson;
	}

	@Override
	public String toString() {
		return super.toString() + ", limitPerson=" + limitPerson;
	}
}
