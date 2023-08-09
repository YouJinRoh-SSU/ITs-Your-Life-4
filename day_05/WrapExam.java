package day_05;

import java.util.ArrayList;

public class WrapExam {
	public static void main(String[] args) {
		int i = 5;
		Integer ii = i;//박싱 : int타입을 integer로 박싱하는 코드. Integer ii = new Integer(i);인데 그냥 i로 해도됨
		String ss = ii.toString();
		String ss2 = "200";
		int k = Integer.parseInt(ss2); //숫자로 변환시켜줌 
		
		int j = ii; //언박싱 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(i);
	}

}
