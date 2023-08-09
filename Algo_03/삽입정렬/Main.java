package 삽입정렬;

import java.util.Scanner;

public class Main {
	static void InsertSort(int[] a, int n){
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i;  j >0  && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}//for
			
			a[j] = tmp;
			for (int m =0;m < n;m++){
				System.out.print(a[m]+" ");
				}//for
			System.out.println();
        }//for
	}// 삽입정렬
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nx = sc.nextInt();//배열 크기 입력
	    int[] x = new int[nx];
	    for (int i = 0; i < nx; i++) {//배열 입력
			x[i]=sc.nextInt();
		}
	    InsertSort(x, nx);
		for (int i = 0; i < nx; i++) {
			System.out.print(x[i]+" ");
		}
	}//main
}//class
