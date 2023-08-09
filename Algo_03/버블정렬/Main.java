package 버블정렬;

import java.util.Scanner;
//뒤에서부터 작은수를 앞으로 보내기 
public class Main {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}//swap
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n-1; i++) {
			for (int j = n-1; j > i; j--) {
				if (a[j-1] > a[j])
					swap(a, j-1, j);
			}//for
		}//for
	}//bubble
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nx = sc.nextInt();//배열 크기 입력
	    int[] x = new int[nx];
	    for (int i = 0; i < nx; i++) {//배열 입력
			x[i]=sc.nextInt();
		}
		bubbleSort(x, nx);
		for (int i = 0; i < nx; i++) {
			System.out.println(x[i]);
		}
	}
}//class

