package day_03;
/** 상품기본정보 정의용 클래스 */
public class Product {
	String code;//상품코드
	String name;//상품이름
	String company;//제조사
	int price; //상품가격
	//static 없는건 객체의 소속. 객체 생성 후 사용 가능
	static int count = 0; //클래스 소속임. 호출할 떄 클래스 이름을 먼저 => Product.count=3이렇게, 위의 객체랑은 다른 차원에서 동작 
	//static은 클래스 당 딱 하나씩만 생성됨 
	
	//Generate Construct and Fields 
	public Product(String code, String name, String company, int price) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public void printInfo() {
		System.out.println("code = " +code+ " name = "+name+ " company = "+company+" price = "+ price);
		
	}
	static public void prn() {
		//그냥 price는 불가능 => non static이라서
		Product p1=new Product("11","11","11",100);
		p1.price = 200; //는 가능함
		//static은 주로 독립적 작업용으로 활용. random이나 count 값 셀 때 
	}
	

}
