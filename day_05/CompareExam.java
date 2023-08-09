package day_05;

import java.util.Arrays;

public class CompareExam {//클래스 자체의 순서를 정하는, but 한가지 기준으로만 정렬이 가능하다(오름차순)
	public static void main(String[] args) {
		MyMember[] mems = new MyMember[4];
		int count = 0; //객체 저장 위치
		mems[count++] = new MyMember("홍길동",33);
		mems[count++] = new MyMember("김길동",25);
		mems[count++] = new MyMember("박길동",30);
		mems[count++] = new MyMember("홍길동",33);
		
		//배열 정렬은 Arrays.sort(배열)
		Arrays.sort(mems, new NameComparator()); //sort가 외부에서 부른 정렬기로 정렬
		System.out.println("**정렬후**");
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
		///
		System.out.println("**mems 값 비교**");
		System.out.println(mems[0] == mems[1]);
		System.out.println(mems[0].equals(mems[1])); //MyMember에서 equals메서드 다시 정의하면 true 
		
	}//class
}//main
