package day_0724;

public class MyShape {
	private int x=100, y=200;//x에 처음에 묵시적으로 0들어갔다가 100들어감 
	
	//생성자메서드(기본, 모든 멤버를 매개변수로 받는 생성자)
	public MyShape() {
	}
	public MyShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	

	public int getX() {
		return x;
	}
	public void setX1(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY1(int y) {
		this.y = y;
	}
	public String draw() {
		return "";
	}

}
