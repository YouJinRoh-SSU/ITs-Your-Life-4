package day_0725;

public class MyCircle extends MyShape implements MyDrawable{
	private int radius;
	public MyCircle() {
		// TODO Auto-generated constructor stub
	}
	
	public MyCircle(int x1, int y1, int radius) {
		super(x1, y1);//부모 클래스에서 가져옴 
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + "MyCircle [radius=" + radius + "]";
	}

	@Override 
	public void draw() {
		System.out.println("draw Line");
	}


}
