package 재귀리뷰;

//중복없이, 순서없이 
public class 경우의수3_조합 {
	static int[] arr;//원소
	static boolean[] visited;//사용여부//boolean의 기본은 false
	static int n;//답의 길이
	static int[] result;//답 저장 배열
	
	public static void main(String[] args) {
		//원소 {1,2,3}에 대한 모든 숫자 조합
		arr = new int[] {1, 2, 3};//원소가 반복할 숫자
		visited = new boolean[arr.length];
		n= 2;//출력할 숫자 조합 길이 
		result = new int[n];//정답 저장할 배열 
		
		recur(0,0); //깊이 0을 전달		
	}

	private static void recur(int depth, int start) {
		//종료조건
		if(depth == n) {//깊이와 답길이가 동일 답출력 
			printResult();
			return;
		}
		//처리코드(result에 숫자를 누적)
		for (int i = start; i < arr.length; i++) {
			//arr의 i번째 숫자가 미사용인 경우에만 사용
			if(visited[i] == false ) {
				result[depth] = arr[i];//깊이 자리에 i번째 숫자 저장
				visited[i] = true;
				recur(depth+1,i+1);//깊이 저장 후 재귀 호출
				visited[i] = false;
			}
		}
		
	}

	private static void printResult() {
		for (int i : result) {//result 순서대로 출력
			System.out.println(i);//붙여서 출력
		}
		System.out.println();//줄바꿈 
		
	}

}

