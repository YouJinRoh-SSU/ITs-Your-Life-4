package b2961;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//부분집합으로 풀기 
public class Main2 {
	static int[][] arr;
	static int N;
	static boolean[] visit;
	static int ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());//재료의 개수
        arr = new int[N][2];
        visit = new boolean[N];
       
        
        for (int i = 0; i < N; i++) {
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}//각 재료의 신맛, 쓴맛 입력
        
        ans = Integer.MAX_VALUE;
        subset(0);
        System.out.println(ans);
         
	}//main

	private static void subset(int idx) {
		//종료조건
		if(idx == N) {
			int multi=1;
			int ssum=0;
			int cnt=0;
			
			for (int j = 0; j < N; j++) {
				if (visit[j] ) {
					multi = multi*arr[j][1];//신맛의 곱 구하기
					ssum = ssum+arr[j][0];//단맛의 합 구하기 
					cnt++;//공집합이 아닌지 확인하기 위해 
				}//if
			}//for
			if(cnt!=0) {
				ans = Math.abs(multi-ssum);//답 계산
			}
			return;
		}//if 종료조건 
		
		visit[idx] =true; //부분집합 구하기 
		subset(idx+1);
		visit[idx] = false;
		subset(idx+1);
					
}
}//class
	


