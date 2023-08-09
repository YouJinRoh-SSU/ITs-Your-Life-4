package 알고리즘과목평가1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유퀴즈 {
	static int[] arr;//원소
	static int N;//입력할 숫자의 개수
	static boolean[] visited;//사용여부//boolean의 기본은 false
	static int n;//세 개의 숫자 고르기 
	static int[] result;//답 저장 배열
	static int k;//유재석이 불러준 숫자
	static int sum;//고른 숫자들의 합
	static int ans;//답이 가능한 숫자들의 합 저장 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());//입력할 숫자 개수
        k=Integer.parseInt(st.nextToken());//유재석이 불러준 숫자 합 제한 
        arr = new int[N];//입력할 숫자 배열 
        
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}//입력 숫자 배열 저장 
		
		visited = new boolean[arr.length];//해당 숫자가 사용되었는지 확인하는 요소
		n= 3;//출력할 숫자 조합 길이 
		result = new int[n];//정답 저장할 배열 
		ans = Integer.MAX_VALUE;
		
		uquiz(0,0); //깊이 0을 전달	
		System.out.println(ans);//출력 
	}

	private static void uquiz(int depth, int start) {
		if (depth == n) {
			sum = 0;
			for (int i : result) {
				sum = sum + i;//result에 저장된 숫자들의 합 구하기 
			if (sum <= k && ans < sum) {  
				ans = sum;//숫자들의 합이 제한 수의 이하이고 기존에 저장된 합들보다 클 경우 ans로 저장
				return;
			}
		}
            
 }

		for (int i = start; i < arr.length; i++) {
			//arr의 i번째 숫자가 미사용인 경우에만 사용
			if(visited[i] == false ) {
				result[depth] = arr[i];//깊이 자리에 i번째 숫자 저장
				visited[i] = true;
				uquiz(depth+1,i+1);//깊이 저장 후 재귀 호출
				visited[i] = false;
			}
		}
	}


}
