package b10986;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[] arr;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();//배열 입력 
		}//for
		
		cnt = 0;//나누어떨어지는 구간의 개수 구하기 
		
		for (int i = 0; i < N; i++) {//구간의 시작점과 끝 구간을 나누어 그 구간의 합 구하기
			for (int j = i; j < N; j++) {
				if (ssum(arr,i,j)%M==0) {
					cnt++;
				}//if
			}//for
		}//for
		System.out.println(cnt);
	}//main
	
	private static int ssum(int[] a, int start, int end) {//배열 구간 합을 구해주는 함수 
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum= sum+a[i];
		}//for
		return sum;
	}//ssum
		
	
}//class
