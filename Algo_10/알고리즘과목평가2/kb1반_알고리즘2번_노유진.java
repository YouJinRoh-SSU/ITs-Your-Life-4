package 알고리즘과목평가2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class kb1반_알고리즘2번_노유진 {
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static boolean[][] visited;
	static int[][] A;
	static int N, M, S;
	static int cov;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());//열
		int N = Integer.parseInt(st.nextToken());//행
		A = new int[N][M];
		visited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j+1));
				if (A[i][j] == 1) S++; //전체 학생 수 계산 
			}//자리 배치 입력
			
			//처음 코로나에 걸리는 학생 좌표 
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			cov =0;//초기 코로나 걸린 사람 0명
			BFS(x, y);			
			System.out.println(A[N-1][M-1]+3);//코로나가 걸린 교육생이 모두 퇴소할 때까지 총 걸리는 날짜
			System.out.println(S-cov);//끝까지 코로나에 걸리지 않은 교육생 수
		}
	}//end main
	
	public static void BFS(int i, int j) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {i, j});
		visited[i][j] = true;
		while (!queue.isEmpty()) {
			int now[] = queue.poll();
			for (int k = 0; k < 4; k++) {//상하좌우 학생 감염 
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				
				if(x>=0 && y>=0 && x<N && y<M) {//상하좌우에 학생이 있는지 없는지 확인 
					if(A[x][y]!=0 && !visited[x][y]) {
						visited[x][y]= true;
						A[x][y] =A[now[0]][now[1]]+1;//첫 코로나 발생이후 몇일이 지났는지 업데이트
						cov++;//코로나 걸린 사람 계산 
						queue.add(new int[] {x, y});
					}
				}
			}
			
		}
	}//end BFS
	
}//end class
