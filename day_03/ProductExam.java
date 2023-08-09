package day_03;

public class ProductExam {
	public static void main(String[] args) {
		Product p1 = new Product("a100","냉장고","삼성",100);
		p1.printInfo();
		p1.count++; //p1을 통해서도 클래스의 static에 접근 가능 but 비추천 
		//Product.count static 접근 추천 방식
		//생성된 객체 생성의 카운팅을 할 때 static 유용. static의 count 사용 
		
		
		//Product p2 = null;
		//p2.price=100;//아무것도 없는데 접근하려한
		//System.out.println("End");
		System.out.println(Product.count);
		System.out.println("End");
	}

}
