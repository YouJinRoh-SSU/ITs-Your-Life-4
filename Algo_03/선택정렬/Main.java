package 선택정렬;

import java.util.Scanner;

public class Main {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}//swap
	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n-1; i++) {
			int min = i;
			for (int j = i+1; j < n; j++) {
				if (a[j]<a[min])
					min = j;//더 작은 값의 인덱스 저장 
				swap(a, i, min);
			}
		}
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nx = sc.nextInt();//배열 크기 입력
	    int[] x = new int[nx];
	    for (int i = 0; i < nx; i++) {//배열 입력
			x[i]=sc.nextInt();
		}
		selectionSort(x, nx);
		for (int i = 0; i < nx; i++) {
			System.out.println(x[i]);
		}
	}
}
