package b12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA비밀번호 {
	static int checkArr[];//비밀번호 체크 배열
	static int myArr[];//현재 상태 배열
	static int checkSecret;//최소 개수 충족하는지 확인하는 배열
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int S = Integer.parseInt(st.nextToken());//문자열의 길이
		int P = Integer.parseInt(st.nextToken());//부분 문자열의 길이
		int result = 0;
		char A[] = new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret = 0;
		
		A = bf.readLine().toCharArray();//문자열 데이터
		st = new StringTokenizer(bf.readLine());//DNA 문자열 사용자 입력
		for (int i = 0; i < 4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());//문자열 최소 개수 저장 배열
			if (checkArr[i]==0)
				checkSecret++;//최소 개수가 0개면 이미 하나 만족하는 것이므로
		}//for
		for (int i = 0; i < P; i++) {
			ADD(A[i]);
		}
		if (checkSecret == 4) 
			result++;
		for (int i = P; i < S; i++) {
			int j = i - P;
			ADD(A[i]);
			Remove(A[j]);
			if (checkSecret==4)
				result++;
		}
		System.err.println(result);
		bf.close();
		
	}
	//ADD함수
	private static void ADD(char c) {
		switch(c) {
		case 'A' :
			myArr[0]++;
			if(myArr[0] == checkArr[0])
				checkSecret++;
			break;
		case 'C' :
			myArr[1]++;
			if(myArr[1] == checkArr[1])
				checkSecret++;
			break;
		case 'G' :
			myArr[2]++;
			if(myArr[2] == checkArr[2])
				checkSecret++;
			break;
		case 'T' :
			myArr[3]++;
			if(myArr[3] == checkArr[3])
				checkSecret++;
			break;
		}//switch
	}//ADD
	
	//Remove힘수
	private static void Remove(char c) {
		switch(c) {
		case 'A' :
			if(myArr[0] == checkArr[0])
				checkSecret--;
			myArr[0]--;
			break;
		case 'C' :
			if(myArr[1] == checkArr[1])
				checkSecret--;
			myArr[1]--;
			break;
		case 'G' :
			if(myArr[2] == checkArr[2])
				checkSecret--;
			myArr[2]--;
			break;
		case 'T' :
			if(myArr[3] == checkArr[3])
				checkSecret--;
			myArr[3]--;
			break;
		}//switch
	}//Remove

}
