package b1697_숨박꼭질BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static boolean[] visited;
	static int[] A;
	static int N, k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//수빈
		int k = sc.nextInt();//동생
		BFS(N);
	}

public static void BFS(int i) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(i); 
		visited[i] = true;
		int count = 1;
		
		while (!q.isEmpty()) {
			count++;
			int x = q.remove();
			visited[x] = true;
			if (x-1 == k || x+1 == k || x*2 == k) {
                System.out.println(count);
                return;
            }
            if (x-1 >= 0 && !visited[x-1]) {
                visited[x-1] = true;
                q.add(x-1);
            }
            if (x+1 <= 100000 && !visited[x+1]) {
                visited[x+1] = true;
                q.add(x+1);
            }
            if (x*2 <= 100000 && !visited[x*2]) {
                visited[x*2] = true;
                q.add(x*2);
            }
			
		}//end while
		
			}//end BFS
}
