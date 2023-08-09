package day_0724;

import java.util.ArrayList;

public class MyShapeListService {
	private ArrayList<MyShape> shapes = new ArrayList<MyShape>();
	
	public void add(MyShape ms) {
		shapes.add(ms);
	}
	public int getCount() {
		return shapes.size();
	}
	public MyShape findByPosition(int startX, int startY) {
		for (MyShape myshape : shapes) {
			if (myshape.getX()==startX && myshape.getY()==startY) {
				
			}
		}
		return null;
	}
	public boolean remove(MyShape findShape) {	
		return shapes.remove(findShape);
	}
	public void printAll() {
		System.out.println("**전체출력**");
		for (MyShape myshape : shapes) {
			System.out.println(myshape);
		}
	}
}
