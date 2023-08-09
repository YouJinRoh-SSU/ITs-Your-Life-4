package 재귀리뷰;

//중복 가능
public class 경우의수 {
	static int[] arr;//원소
	static int n;//답의 길이
	static int[] result;//답 저장 배열
	
	public static void main(String[] args) {
		//원소 {1,2,3}에 대한 모든 숫자 조합
		arr = new int[] {1, 2, 3};//원소가 반복할 숫자
		n= 3;//출력할 숫자 조합 길이 
		result = new int[n];//정답 저장할 배열 
		
		recur(0); //깊이 0을 전달		
	}

	private static void recur(int depth) {
		//종료조건
		if(depth == n) {//깊이와 답길이가 동일 답출력 
			printResult();
			return;
		}
		//처리코드(result에 숫자를 누적)
		for (int i = 0; i < arr.length; i++) {
			result[depth] = arr[i];//깊이 자리에 i번째 숫자 저장
			recur(depth+1);//깊이 증가 후 재귀 호출
		}
		
	}

	private static void printResult() {
		for (int i : result) {//result 순서대로 출력
			System.out.println(i);//붙여서 출력
		}
		System.out.println();//줄바꿈 
		
	}

}
