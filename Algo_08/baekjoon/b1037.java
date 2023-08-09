package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b1037 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
        //가장 작은 약수랑 가장 큰 약수 곱하기
        Arrays.sort(arr);
        int ans = arr[0] * arr[n-1];
        System.out.println(ans);
	}

}
