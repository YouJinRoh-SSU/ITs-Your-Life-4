package 재귀리뷰;

public class 경우의수_연습 {
	static int n;
	static int[] arr;
	static boolean[] visit;
	static int[] result;
	
	 public static void main(String[] args) {
	        arr = new int[]{1, 2, 3};
	        n = 3;
	        visit = new boolean[n];
	        powerSet(0);//멱집합 
//	        bit();
	    }

	private static void powerSet(int depth) {
		if(depth == n) {
			printResult();
			return ;
		}
		visit[depth] =false;
		powerSet(depth+1);
		visit[depth] =true;
		powerSet(depth+1);
		
		
	}

	private static void printResult() {
		for (int i = 0; i < n; i++) {
			if(visit[i] == true) {
				System.out.println(arr[i]);
			}
		}
		
	}
	 
	
}