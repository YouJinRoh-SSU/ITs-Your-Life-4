package b11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1차원 구간 합 구하기 
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//buffeRedreader => readLine 쓰기 위해
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
	    //공백 문자 기준 문자 분할
		
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		long[] S = new long[suNo + 1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 1; i <= suNo; i++) {
			S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());//StringTokenizer 객체에서 다음 토큰을 리턴
		}//이전값 더하기 현재값 
		
		for (int q = 0; q < quizNo; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.err.println(S[j]-S[i-1]);
		}
		
	}
	
}
