package b2961;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int[][] dd;
	static int N;
	static boolean[] visit;
	static int[] result;
	static int min;
	static int ss;
	static int cc;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());//재료의 개수
        arr = new int[N];
        dd = new int[N][2];
        visit = new boolean[N];
        result = new int[N];
        min = 500;
        
        for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}//arr = 0,1,2,3 저장 => 이 숫자로 조합 계산 
        
        for (int i = 0; i < N; i++) {
			dd[i][0]=Integer.parseInt(st.nextToken());
			dd[i][1]=Integer.parseInt(st.nextToken());
		}//각 재료의 신맛, 쓴맛 입력
        recur(0,0);
         
	}

	private static void recur(int depth, int start) {
		//종료조건
				if(depth == N) {//깊이와 답길이가 동일 답출력 
					Resultmin();
					return;
				}
				//처리코드(result에 숫자를 누적)
				for (int i = start; i < arr.length; i++) {
					if(visit[i] == false ) {
						result[depth] = arr[i];//깊이 자리에 i번째 숫자 저장
						visit[i] = true;
						recur(depth+1,i+1);//깊이 저장 후 재귀 호출
						visit[i] = false;
					}
				}
				
			}

	private static int Resultmin() {//조합 1개 완성할 때마다 
		ss=0;//곱
		cc=0;//합
	
		for (int i : result) {//result 순서대로 출력
			ss = ss * dd[i][0];
			cc = cc + dd[i][1];
		}
		if(min>=Math.abs(ss-cc))
			min = ss-cc;
		return min;		
	}

		
}
	


