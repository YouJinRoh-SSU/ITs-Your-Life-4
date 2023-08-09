package 퀵정렬;

import java.util.Scanner;

public class Partition {
	static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }//swap
	
	static void partition(int[] a, int n) {
		int pl = 0;//왼쪽 커서
		int pr = n-1;//오른쪽 커서
		int x = a[n/2];//피벗
		
		do{
			while(a[pl]<x)pl++;
			while(a[pr]>x)pr--;
			if(pl<=pr)
				swap(a,pl++,pr--);
		}while(pl<=pr);		
	}//partition
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nx = sc.nextInt();
		int[] x = new int[nx];
		for (int i = 0; i < nx; i++) {
			x[i] = sc.nextInt();
		}//사용자 배열 입력 
		partition(x, nx);
		
	}//main
}//class
