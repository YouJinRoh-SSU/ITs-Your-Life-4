package b7562_나이트의이동;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static int[] dx = {1,2,1,2,-1,-2,-2,-1};
    static int[] dy = {2,1,-2,-1,2,1,-1,-2};
    static int[][] arr;
    static boolean[][] visited;
    static int x1, x2, y1, y2;

public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    st = new StringTokenizer(br.readLine());
    
	int N = Integer.parseInt(st.nextToken());//체스판 크기
	x1 = Integer.parseInt(st.nextToken());
    y1 = Integer.parseInt(st.nextToken());
    x2 = Integer.parseInt(st.nextToken());
    y2 = Integer.parseInt(st.nextToken());
	
	BFS();
	sb.append(arr[x2][y2]).append("\n");
	System.out.println(sb);
}//end main

public static void BFS() {
	Queue<int[]> queue = new LinkedList<>();
	queue.offer(new int[] {x1, y1}); 
	visited[x1][y1] = true;
	
	while (!queue.isEmpty()) {
		int[] now = queue.poll();
		
		for (int k = 0; k < 4; k++) {//나이트가 이동 가능한 좌표들
			int x = now[0] + dx[k];
		    int y = now[1] + dy[k];
		    
		    if (!visited[x][y]) {//방문한 곳이 아니라면
                queue.add(new int[]{x, y});
                arr[x][y] = arr[now[0]][now[1]] + 1;//얼마나 이동했는지 계산 
                visited[x][y] = true;
            }
		}
	}//end while
	
		}//end BFS
}//end class
