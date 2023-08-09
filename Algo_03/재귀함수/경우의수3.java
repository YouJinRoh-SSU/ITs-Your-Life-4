package 재귀함수;

public class 경우의수3 {
	static int[] arr;
	static int[] result;
	static int n;
	static boolean[] visited;
	
	public static void main(String[] args) {
		arr = new int[] {1,2,3};//원소 저장 배열 //선언 이후에 배열에 값을 할당할 때는 new 를 붙여야함 
		result = new int[arr.length];//답 저장 배열 
		visited = new boolean[arr.length];//사용 여부를 저장
		n = 3;// 추출의 갯수
		recur(0);
	}
	
	private static void recur(int depth) {
		if (depth == n) {//종료조건
			print();
			return;
		}
		//처리코드(깊이의 숫자 위치에 i값을 저장)
		for (int i = 0; i < arr.length; i++) {
			if(visited[i]==false) {
				result[depth] = arr[i];
			    visited[i]=true;
			    recur(depth+1);
			    visited[i]=false;
		}
	}
	}
	private static void print() {
		for (int i : result) {
			System.out.println(i);
		}
		System.out.println();
	}

}
