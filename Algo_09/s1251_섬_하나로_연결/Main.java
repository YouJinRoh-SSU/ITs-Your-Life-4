package s1251_섬_하나로_연결;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Connect implements Comparable<Connect> {
		   int idx;
		   long length;
		 
		   private Connect(int idx, long length) {
		      this.idx = idx;
		      this.length = length;
		   }
		 
		   @Override
		   public int compareTo(Connect o) {
		      return Long.valueOf(this.length).compareTo(o.length);//거리로 정렬 
		   }
		}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		 
		int T = Integer.parseInt(in.readLine());
		 
		int N;
		int[][] island;
		long[] distance;
		boolean[] visited;
		double E, cost;
		 
		PriorityQueue<Connect> pQueue = new PriorityQueue<>();//connect의 거리를 기준으로 우선순위?
		N = Integer.parseInt(in.readLine());//섬 갯수 입력 
		island = new int[N][2];
		 
		st = new StringTokenizer(in.readLine());
		for (int n = 0; n < N; n++) island[n][0] = Integer.parseInt(st.nextToken());//x좌표를 0열에 저장
		 
		st = new StringTokenizer(in.readLine());
		for (int n = 0; n < N; n++) island[n][1] = Integer.parseInt(st.nextToken());//y좌표를 1열에 저장 
		 
		E = Double.parseDouble(in.readLine());//환경부담 세율
		cost = 0;//총 비용 
		 
		visited = new boolean[N];//방문했는지 안했는지 배열 
		distance = new long[N];//거리 배열
		Arrays.fill(distance, Long.MAX_VALUE);
		int idx = 0;
		
		//탐색과 출력 
		Connect now = new Connect(idx, 0);
		pQueue.offer(now);
		
		while (!pQueue.isEmpty()) {
			   now = pQueue.poll();//큐애서 꺼내기 
			   if (visited[idx = now.idx]) 
				   continue;
			   visited[idx] = true;
			   distance[idx] = now.length;//거리 저장 
			   cost+= distance[idx];
			 
			   for (int i = 0; i < N; i++) {
			      if (visited[i]) 
			    	  continue;
			      long length = (long) (Math.pow(Math.abs(island[idx][0] - island[i][0]),2) + 
			    		  Math.pow(Math.abs(island[idx][1] - island[i][1]),2));//각 점들과 거리 계산 
			      
			      if (distance[i] > now.length+length) 
			    	  pQueue.offer(new Connect(i, length));
			   }
			}
			//pQueue.clear(); //항상 비어있음
			sb.append(Math.round(cost * E)).append("\n");
	}//main 
	
}//class