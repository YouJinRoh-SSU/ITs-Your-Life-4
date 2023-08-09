package b11399;

import java.util.Scanner;

public class atm {
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
		int n = sc.nextInt();//배열 크기 입력
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {//배열 입력
			arr[i]=sc.nextInt();
			}//for
	    bubbleSort(arr,n);
	    int sum = 0;
	    for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
	    System.out.println(sum);
	   
}//main
}//class
