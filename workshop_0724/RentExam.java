package WS_0724;

public class RentExam {
	public static void main(String[] args) {
		RentService rs = new RentService();
		
		rs.add(new Sedan(1111, 10000, "승용차", 1990, 1990, 5));
		rs.add(new SUV(2222, 20000, "승합차", 1990, 1990, 9, 1));
		rs.add(new Bus(3333, 30000, "버스", 1990, 1990, 45));
		rs.add(new Truck(4444, 40000, "트럭", 1990, 1990, 10));
		
		rs.add(new Personal(100, "개인", "홍길동", "010-1234-5678"));
		rs.add(new Company(2000, "법인", "(주)멀캠", "88-20230", "02-789-3456"));
		
		rs.rent(1111, 100, 10000, "2023-07-01", "7:00", "2023-07-07", "17:00");
		rs.rent(3333, 2000, 30000, "2023-07-02", "7:00", "2023-07-05", "17:00");
		
		System.out.println("대여 횟수 : " + rs.getRentCount());
		
		rs.printRent();
	}
}
