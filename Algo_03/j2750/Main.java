package j2750;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int k = sc.nextInt();//과자 한 개의 가격
	int n = sc.nextInt();//과자의 개수
	int m = sc.nextInt();//현재 동수가 가진 돈
	int c = k*n - m ;
	if (c>=0) {
		System.out.println(c);
	}else {
		System.err.println(0);
	}

	}
}
