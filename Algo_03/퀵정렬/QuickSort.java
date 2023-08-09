package 퀵정렬;

import java.util.Scanner;

public class QuickSort {
	static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }//swap
	
	static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];//초기 정렬 기준 설정 
		
		do{
			while(a[pl]<x)pl++;
			while(a[pr]>x)pr--;
			if(pl<=pr)//초기 기준에 맞지 않을 떄 while 멈추고 
				swap(a,pl++,pr--);
		}while(pl<=pr);
		
		if (left<pr) quickSort(a, left, pr);
		if (pl<right) quickSort(a, pl, right);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.println("퀵 정렬");
		System.err.println("요소수: ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for (int i = 0; i < nx; i++) {
			System.out.println(i);
			x[i]=sc.nextInt();//사용자 배열 입력 
		}
		quickSort(x, 0, nx-1);//퀵정렬
		
		System.out.println("오름차순으로 정렬");
		for (int i = 0; i < nx; i++) {
			System.out.println(x[i]);//정렬된 배열 출력
		}
	}
}
