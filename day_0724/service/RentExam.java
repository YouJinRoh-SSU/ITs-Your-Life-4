package day_0724.service;

public class RentExam {
	public static void main(String[] args) {
		RentService rs = new RentServie();
		rs.add(100, 250, 50000, "2023-07-01",7,"2023-07-07",17);
		rs.add( 1000, 123, 70000, "2023-07-02",7,"2023-07-05",17);
	}

}
