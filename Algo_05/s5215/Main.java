package s5215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//부분집합 이용
public class Main {
	static int[][] arr;
	static int n;
	static int k;
	static boolean[] visit;
	static int ans;
	static int aa;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());//재료 개수
        k=Integer.parseInt(st.nextToken());//제한 칼로리
        arr = new int[n][2];
        ans =0 ;
        for (int i = 0; i < n; i++) {
			arr[i][0] = Integer.parseInt(st.nextToken());//맛에 대한 점수
			arr[i][1] = Integer.parseInt(st.nextToken());//칼로리
		}
        
        subset(0);
        System.out.println(ans);
	}

	private static void subset(int depth) {
		//종료조건
		if(depth == n) {
			aa = 0;
			for (int i = 0; i < n; i++) {
				if(visit[i]==true) {
					aa = aa + arr[i][0];
				}
			if (aa<k & aa>ans) ans=aa; 
			
			}
			return ;
		}
		visit[depth] = true;
		subset(depth+1);
		visit[depth] = false;
		subset(depth+1);
	}

}
