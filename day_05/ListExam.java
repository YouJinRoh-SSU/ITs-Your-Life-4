package day_05;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		//회원이름관리
		ArrayList<String> names = new ArrayList<String>();
		names.add("홍길동");
		names.add("김길동");
		names.add("박길동");
		System.out.println(names);
		names.add(0, "최길동");
		System.out.println(names);
		String r = names.remove(2);
		System.out.println(names);
		System.out.println(r);
		names.clear();
		System.out.println(names);
	}
}
