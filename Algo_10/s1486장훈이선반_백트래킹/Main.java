package s1486장훈이선반_백트래킹;

import java.util.Scanner;

public class Main {
	public static int N, B, answer;
	public static int[] people;
	public static boolean[] isSelected = new boolean[20];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//테스트케이스
        int N = sc.nextInt();//점원의 수
        int B = sc.nextInt();//선반의 높이
        for (int i = 0; i < N; i++) {//점원들의 키 
			people[i] = sc.nextInt();
		}
        answer = Integer.MAX_VALUE;
        powerset(0);
        System.out.println(answer);

	}//end main
	public static void powerset(int cnt) {
		if (cnt == N) {
			int sum = 0;
			
			for (int i = 0; i < N; ++i) {
				if (isSelected[i]) {
					sum += people[i];
				}
			}
			
			if (sum >= B) {
				sum -= B;
				answer = (answer > sum) ? sum : answer;
			}
			
			return;
		}
		//부분집합으로 풀기 
		isSelected[cnt] = true;
		powerset(cnt + 1);
		isSelected[cnt] = false;
		powerset(cnt + 1);
	}
}//class
