package 재귀함수;

import java.util.Scanner;

public class 유클리드호제 {
	static int gcd(int x, int y) {
		if (y==0)
			return x;
		else
			return gcd(y, x%y);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));
	}

}
