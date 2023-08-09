package day_04;
/** 그림판 어플 예제*/ 
public class DrawExam {
	public static void main(String[] args) {
		//그려진 도형 정보를 관리
		// 선, 원, 삼각, 사각, ...
		//Line : x, y, x2, y2
		//Circle : x, y, radius 원의 중심좌표와 반지름
		//Shape{x, y}
		//Line extends Shape {x2, y2}
		//Circle extends Shape {radius }
		
		Line [] lines = new Line[100];
		int lineCount = 0;
		Circle[] circles = new Circle[100];
		int circleCount = 0;
		
//		lines[lineCount++] = new Line();
//		circles[circleCount++] = new Circle();
//		circles[circleCount++] = new Circle();
//		lines[lineCount++] = new Line();
//circle에서null인건 line,....if 문을 너무 많이 써야함 아래처럼 해야함.
		
		Shape[] sarr = new Shape[100];
		int shapeCount = 0;
		sarr[shapeCount++] = new Line();
		sarr[shapeCount++] = new Circle();
		sarr[shapeCount++] = new Circle();
		sarr[shapeCount++] = new Line();
		
		
	}//main
}//class
