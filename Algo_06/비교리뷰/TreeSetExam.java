package 비교리뷰;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(30);
		ts.add(100);
		ts.add(200);
		ArrayList<Integer> arr = new ArrayList<Integer>(ts);
		System.out.println(arr);
		///////////////////
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(30);
		hs.add(200);
		hs.add(100);//앞자리 기준으로 정렬 => 100, 200, 30임 //tree는 들어갈 때부터 정렬임
		arr = new ArrayList<Integer>(hs);
		System.out.println(arr);
	}

}
