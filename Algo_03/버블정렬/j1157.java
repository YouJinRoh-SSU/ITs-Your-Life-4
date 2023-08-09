package 버블정렬;

import java.util.Scanner;
//큰 수부터 뒤로 보내는 버블 정렬 
public class j1157 {
static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }//swap
static void bubbleSort(int[] a, int n) {//n은 배열의 크기 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1])
                    swap(a, j+1, j);
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
    }