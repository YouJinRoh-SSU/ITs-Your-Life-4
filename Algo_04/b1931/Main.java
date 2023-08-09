package b1931;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//회의의 개수 
		int[][] A = new int[N][2];
		for (int i = 0; i < N; i++) {
			A[i][0] = sc.nextInt();//회의 시작 시간
			A[i][1] = sc.nextInt();//회의 종료 시간
		}
		Arrays.sort(A, new Comparator<int[]>(){ //종료 시간을 기준으로 정렬 
			public int compare(int[] S, int[] E) {
				if(S[1]==E[1]) {//종료 시간이 같을 때 시작 시간을 기준으로 정렬 
					return S[0] - E[0];
				}
				return S[1]-E[0];
			}
		});
		int count = 0;
		int end = -1;
		for (int i = 0; i < N; i++) {
			if(A[i][0]>= end) {//앞 회의의 종료 시간보다 클 경우
				end = A[i][1];
				count++;
			}
		}
		System.out.println(count);
	}

}
