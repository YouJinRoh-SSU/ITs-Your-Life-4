package b11050;

import java.util.Scanner;

public class 이항계수 {
	static int i, j;
	static int dd(int n, int k) {
		if (k==1) {
			return n;
			}else if (k==0) {
			return 1;
			}else if (n==k) {
				return 1;
				}else {return dd(n-1,k) + dd(n-1,k-1);}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		j = sc.nextInt();
		System.out.println(dd(i,j));
	}
}
