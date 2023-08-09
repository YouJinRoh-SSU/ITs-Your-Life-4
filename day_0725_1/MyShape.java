package day_0725_1;
/**도형들의 공통 속성 정의*/

public abstract class  MyShape {
	private int x, y;//도형 기준 좌표
	
	public MyShape() {
		// TODO Auto-generated constructor stub
	}
	public MyShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyShape [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}
	
	public abstract String draw();//도형 그리기 기능 제공
	//abstract를 하나라도 가지고 있으면 클래스도 abstract

}
