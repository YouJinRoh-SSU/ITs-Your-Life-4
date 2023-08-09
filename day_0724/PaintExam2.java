package day_0724;

public class PaintExam2 {
	public static void main(String[] args) {
		MyLine[] lines = new MyLine[100];
		MyCircle[] circles = new MyCircle[100];
		
		MyLine m1 = new MyLine(0,0,0,0);
		lines[0] = m1;
		//circles[0] = m1;//형변환 //업캐스팅 
		MyShape[] msarr = new MyShape[100];
		msarr[0] = m1;
		msarr[1] = new MyCircle(0,0,10);
		
		MyShape ms = new MyCircle(0,0,10);
		System.out.println(ms.draw());
		
	}

}
