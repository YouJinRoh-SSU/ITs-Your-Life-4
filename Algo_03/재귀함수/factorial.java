package 재귀함수;

import java.util.Scanner;

public class factorial {
	static int factorial(int n) {
		if(n>0)
			return n * factorial(n-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(factorial(x));
}

}
