package day_0724;

public class MyCircle extends MyShape{
	private int x,y,radius;
	public MyCircle() {
		// TODO Auto-generated constructor stub
	}
	public MyCircle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public String draw() {
		return "CIRCLE";
	}
	@Override
	public String toString() {
		return "MyCircle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	

}
