package b2178_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	//상하좌우를 탐색하기 위한 배열 선언 
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static boolean[][] visited;
	static int[][] A;
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());//
		int M = Integer.parseInt(st.nextToken());//
		A = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j+1));//substring : 문자열 일부 추출 함수
			}
		}
		BFS(0, 0);
		System.out.println(A[N-1][M-1]);
	}//end main
	
	public static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i, j});//queue.offer : 큐 끝에 메서드를 추가하는 함수 
		visited[i][j] = true;
		while (!queue.isEmpty()) {
			int now[] = queue.poll();//큐에 메서드를 삭제하는 함수 
			for (int k = 0; k < 4; k++) {//상하좌우 확인하기 
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				
				if(x>=0 && y>=0 && x<N && y<M) {//좌표 유효성 검사하기
					if(A[x][y]!=0 && !visited[x][y]) {
						visited[x][y]= true;
						A[x][y] =A[now[0]][now[1]]+1;//깊이 업데이트하기 
						queue.add(new int[] {x, y});
					}
				}
			}
		}
	}
}//end class
