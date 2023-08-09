package b1920_정수존재확인;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//숫자 개수
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		Arrays.sort(A);
		for (int i = 0; i < M; i++) {
			boolean find = false;
			int target = sc.nextInt();
			
			int start = 0;
			int end = A.length -1;
			while(start<=end) {
				int midi = (start + end)/2;
				int midiv = A[midi];
				
			}
		}
	}

}
