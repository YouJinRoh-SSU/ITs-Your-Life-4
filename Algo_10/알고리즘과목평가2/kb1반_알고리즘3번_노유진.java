package 알고리즘과목평가2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kb1반_알고리즘3번_노유진 {
		static boolean[] visited;
		static int N, M;
		static int[] arr;
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();//위치 수열 크기
			int M = sc.nextInt();//굴리는 제한 시간
			arr = new int[N];//위치 수열 배열 
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();			
			}
			int S = BFS(0);
			System.out.println(S);
		}//end main
		
		public static int BFS(int i) {
			Queue<Integer> q = new LinkedList<>();
			q.offer(i); 
			visited[i] = true;
			int size = 1;//초기 소똥 크기 
			int time = 0;
			while (!q.isEmpty()) {
				int x = q.remove();
				if(time>M) {
					break;//제한 시간이 되면 끝냄 
				}
				visited[x] = true;
	            if (x+1 <= N && !visited[x+1]) {
	                visited[x+1] = true;
	                size = size + arr[x+1];//i+1칸에 기록된 숫자만큼 크기가 늘어남
	                q.add(x+1); 
	            }
	            if (x+2 <= N && !visited[x+2]) {
	                visited[x+2] = true;
	                size = (size/2) + arr[x+2];//현재크기는 절반으로 줄어들고, i+2칸에 기록된 숫자만큼 크기가 늘어남
	                q.add(x+2);
	            }
	            time++;
			}//end while
			return size;
				}//end BFS				
	}//end class

