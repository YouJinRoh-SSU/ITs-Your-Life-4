package b10986;

import java.io.IOException;
import java.util.Scanner;

public class 알고리즘_1주차과제_노유진  {
	static int N;//숫자 갯수 
	static int M;//나누어 떨어지는 수
	static int[] cnt;//구간합을 M으로 나눴을 때 나머지가 같은 경우의 수 세기 
	static int[] S;//0~i까지의 구간합을 M으로 나눈 나머지를 저장하는 배열
	static int result;
	
	public static void main(String[] args) throws IOException {
		Scanner sc =new Scanner(System.in);
		N = sc.nextInt();//숫자 갯수
		M = sc.nextInt();//나누어 떨어지는 수
		S = new int[N];//구간합을 M으로 나눈 나머지를 저장하는 배열
		result = 0;//구간합을 M으로 나눌 때 나머지가 0인 경우의 수 세기
		
		for (int i = 1; i < N+1; i++) {
			S[i] = (S[i - 1] + sc.nextInt()) % M;//구간합을 M으로 나눈 나머지를 S배열에 저장 
			if(S[i] == 0) {
                result++;//나머지가 0인 경우의 수 세기 
            }
			cnt[(int) S[i]]++;//구간합 나머지별로 경우의 수 저장 (0, 1, 2)
		}//for
		
		for(int i=0; i<M; i++) {
            if(cnt[i] > 1) {
                result += (cnt[i]* (cnt[i]-1) / 2);//해당 갯수 중 2개를 뽑는 경우의 수 세기 =>2개를 뽑아야 연속된 구간의 합을 구함
            }
        }//나머지 인덱스에서 나머지값이 같은 2가지를 뽑는 경우의 수 세기=> 나머지 값이 같아야 그 구간의 합의 나머지가 0이됨 
        System.out.println(result);//결과 출력 
		
	}//main
}//class


