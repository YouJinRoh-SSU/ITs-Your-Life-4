package 비교리뷰;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//사칙연산 유효성 검사

public class s1233_사칙연산유효성 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int test_case = 1; test_case<=1;test_case++) {
			sb.append("#" +  test_case + " ");		
		
		int N = Integer.parseInt(br.readLine());//트리가 갖는 정점의 개수 입력 
		int result = 1;
		
		for (int i = 0; i < N; i++) {
			//정점 정보 입력
			st = new StringTokenizer(br.readLine());
			//정점 번호 
			int number = Integer.parseInt(st.nextToken());
			//연산자인지 숫자인지 
			String s = st.nextToken();//StringTokenizer에서 다음 토큰을 불러오는 메서드 1 - 2 3 이라면 s는 -인 상태?
			
			//연산자와 숫자 중 무엇인지 
			if(st.hasMoreTokens()) {//hashMoreToken : StringTokenizer에 사용할 수 있는 토큰이 더 있는지 확인
				//자식노드가 있는지 확인 
				//자식노드가 있다면 s는 연산자여야함 
				if(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/"))
					result = 0;
			}else {//자식노드가 없다면 s는 숫자여야함 
				if (s.equals("+")&&s.equals("-")&&s.equals("*")&&s.equals("/"))
					result = 0;
			}
		}
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}//end main
}//end class 
