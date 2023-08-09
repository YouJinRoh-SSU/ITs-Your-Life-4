package day_0724;
/** 도형들의 부모, 공통면수, 메서드 정의*/

public class MyLine extends MyShape{
	private int x1, y1, x2, y2;
	
	public MyLine() {
		// TODO Auto-generated constructor stub
	}
	public MyLine(int x1, int y1,int x2, int y2) {
		super(x1, y1);		
		this.x2 = x2;
		this.y2 = y2;
	}
	public int getX() {
		return x2;
	}
	public void setX(int x2) {
		this.x2 = x2;
	}
	public int getY() {
		return y2;
	}
	public void setY(int y2) {
		this.y2 = y2;
	}
	

}
