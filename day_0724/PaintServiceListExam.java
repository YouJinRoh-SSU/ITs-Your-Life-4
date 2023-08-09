package day_0724;

import day_0724.service.MyShapeService;

public class PaintServiceListExam {
	public static void main(String[] args) {
		//도형을 관리할 객체 생성
		MyShapeService mss = new MyShapeService();
		
		MyLine m1 = new MyLine(0,0,3,3);
		mss.add(m1);
		MyLine m2 = new MyLine(6,6,19,19);
		mss.add(m2);
		MyLine m3 = new MyLine(9,9,29,29);
		mss.add(m3);
		System.out.println("저장갯수:"+mss.getCount());
		MyShape findShape = mss.findByPosition(3,3);
		if (findShape==null) {
			System.out.println("못찾음");
		} else {
			System.out.println("찾음 : "+ findShape);
		}
		 
	}

}
