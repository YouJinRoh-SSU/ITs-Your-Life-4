package J9074;

import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * 문제
1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.
예제
입력 
5 6 10 9 3 5 3 5 0
출력
3 : 2개
5 : 3개
6 : 1개
9 : 1개
10 : 1개
 */

//숫자 갯수 + 갯수만큼 숫자 입력하는 문제 => 
//아래는 입력하는 숫자의 개수를 모를 때 
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 문자열 나누기 기능 : StringTokenizer 
		String line = sc.nextLine(); //한줄읽기
		
		StringTokenizer st = new  StringTokenizer(line);
	    //숫자 갯수 알아내기 위해서 StringTokenizer
		
		System.out.println(st.countTokens()); //공백을 기준으로 몇개의 숫자가 들어왔는지
		
		int[] count = new int[11];
		
		//추출할 토큰이 존재하는 동안 반복 
		while(st.hasMoreTokens()) { //hasMoreTokens : 추출한 토큰의 존재 여부 확인 true라면 nextToken 호출함
			String s = st.nextToken(); //nextEliment, nextToken => 순서대로 데이터를 추출해줌
			
			int i = Integer.parseInt(s);//String => int 변환
			if(i>=1 && i <=10) {
				count[i]++;
			}else break;
		} //while 끝
		
		    for(int i =0 ; i<=10; i++) {
		    	if(count[i]==0) {
		    		continue;
			}else {
				System.out.println(i + " : " + count[i] + "개");
			}
	}
// ,를 기준으로 구분할 대 => Delimeter 로 
	}
}


