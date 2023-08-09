package day_0725;

import java.util.Random;

public class RandomExam {
	public static void main(String[] args) {
		Random r = new Random(500);//500을 기준으로 난수 생성 => 생성되는 난수가 동일 
		//r.nextInt(3);//0~3미만 난수를 만들어줌. 3으로 나눈 나머지 중 임의의 값 
		int ri = r.nextInt(45)+1;//1~45
		System.out.println(ri);
		ri = r.nextInt(45)+1;
		System.out.println(ri);
		ri = r.nextInt(45)+1;
		System.out.println(ri);
		//seed :  난수 생성의 기준값 
		
	}

}
