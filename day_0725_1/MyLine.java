package day_0725_1;

public class MyLine extends MyShape{
	private int x2, y2;
	public MyLine() {
		// TODO Auto-generated constructor stub
	}
	
	public MyLine(int x1, int y1, int x2, int y2) {
		super(x1, y1);//부모 클래스에서 가져옴 
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return super.toString() + "MyLine [x2=" + x2 + ", y2=" + y2 + "]";
	}

	@Override //Annotation
	public String draw() {//반드시 구현해야함 
		return "Line";
	}

}
