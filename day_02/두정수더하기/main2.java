package 두정수더하기;

import java.util.Scanner;

/*
 * 1. 컴퓨터가 1~100 사이 임의의 정수 저장
 * 2. "1~100"
 */
public class main2 {

	public static void main(String[] args) {
		double d = Math.random();
		d*=100+1; //1~100 
		int i =(int)d;
		
		
		Scanner kb = new Scanner(System.in); //scanner는 하나만 만들기 
		
		while(true) {
			System.out.println("1~100 사이 숫자를 입력하세요");
			int n = kb.nextInt();
			
			if(n>i) {
				System.out.println("내려주세요");
			    }else if(n<i) {
			    	System.out.println("올려주세요 ");
			    	}else {
			    		System.out.println("정답");
			            break;
		}
		}//end while 
			
	}

}
