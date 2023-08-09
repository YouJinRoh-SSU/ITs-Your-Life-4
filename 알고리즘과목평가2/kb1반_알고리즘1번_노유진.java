package 알고리즘과목평가2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kb1반_알고리즘1번_노유진 {
	static ArrayList<Integer>[] graph;
    static boolean[] visited;
    
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//총 마을 사람 수 
        int M = sc.nextInt();//친구 관계 수  
        
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        
        for (int j = 1; j <=N ; j++) {
            graph[j] = new ArrayList<Integer>();//친구관계를 저장할 리스트 
        }
        
        for (int j = 0; j < M; j++) {
            int a = sc.nextInt();//친구 관계 입력 
            int b = sc.nextInt();
            graph[a].add(b);//배열에 친구관계 추가 
            graph[b].add(a);
        }
        
        int cnt = BFS(1);//1번인 철수를 통해 새로 사귄 친구 수 계산  
        System.out.println(cnt);
    }//end main
    
    private static int BFS(int node) {
        int sub_cnt = 0;//친구 수 계산 
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(node);//큐에 노드 추가 
        visited[1] = true;//1번인 철수 미리 true로 설정 
        
        while (!q.isEmpty()) {
            int n_node = q.poll();
            for (int idx : graph[n_node]) {
                if (visited[idx] == false ) {//앞에서 계산하지 않은 친구 수만 계산
                    visited[idx] = true;
                    sub_cnt += 1;//친해진 친구에 추가 
                    q.add(idx);
                }
            }
        }
        
        return sub_cnt;
    }       
  
}//end class
