package WS_0724;

import java.util.ArrayList;

public class RentService {
	ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
	ArrayList<Member> mems = new ArrayList<Member>();
	ArrayList<Rent> rents = new ArrayList<Rent>();
	
	public void add(Vehicle vehicle) {
		cars.add(vehicle);
	}

	public void add(Member member) {
		mems.add(member);
	}

	public void rent(int carNum, int memberNum, int rentPrice, String startDate, String startTime, String endDate, String endTime) {
		rents.add(new Rent(rents.size()+1, carNum, memberNum, rentPrice, startDate, startTime, endDate, endTime));
	}
	
	public int getRentCount() {
		return rents.size();
	}
	
	public void printRent() {
		for(Rent rent : rents) {
			System.out.println(rent);
		}
	}
}
