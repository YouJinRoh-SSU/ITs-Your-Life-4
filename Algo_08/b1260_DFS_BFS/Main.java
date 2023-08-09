package b1260_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean visited[];
	static ArrayList<Integer>[] A;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());//노드의 개수
		int M = Integer.parseInt(st.nextToken());//엣지의 개수
		int Start = Integer.parseInt(st.nextToken());//탐색 시작 노드 위치
		A = new ArrayList[N+1];
		for (int i = 0; i < N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			A[S].add(E);
			A[E].add(S);
		}
		for (int i = 1; i <= N; i++) {
			Collections.sort(A[i]);
		}
		visited = new boolean[N+1];
		DFS(Start);//깊이 우선 탐색 
		System.out.println();
		visited = new boolean[N+1];
		BFS(Start);//너비 우선 탐색
		System.out.println();
	}
	public static void BFS(int Node) {
		  Queue<Integer> queue = new LinkedList<Integer>();
	        queue.add(Node);
	        visited[Node] = true;

	        while (!queue.isEmpty()){
	            int now_Node = queue.poll();//poll : 반환하고 삭제하는 코드 
	            System.out.println(now_Node + " ");
	            for(int i : A[Node]){
	                if(!visited[i]){
	                    visited[i] = true;
	                    queue.add(i);
	                }
	            }
	        }
	}//end bfs
	public static void DFS(int Node) {
		System.out.println(Node + " ");
		visited[Node] = true;
		for (int i : A[Node]) {
			if (!visited[i])
			DFS(i);
		}	
	}//end dfs
}
