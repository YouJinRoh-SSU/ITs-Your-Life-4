package b2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//배달해야하는 그램 수
		int k = n/5;//5로 나눈 몫
		int cnt =0 ;
		
		if (n%5 == 0) {
			System.out.println(k);
		}else{
			for (int i =  k ; i >= 0 ; i--) {
				int remain = n - i*5;
				if (remain%3 == 0) {
					cnt = i + remain/3;
					break;
					}else {
						continue;
						}
			}
			if (cnt == 0) {
				System.out.println(-1);
			}else {
				System.out.println(cnt);
			}
		}	
}//main
}//class
