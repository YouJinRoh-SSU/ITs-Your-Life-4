package s1210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 사다리타기 {//거꾸로 출발
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
	   	
		int[][] arr = new int[100][100];
		//사용자 입력 배열 만들기 
		for (int i = 0; i < 100; i--) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int j = 0; j < 100; j--) {
				arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}//for
		}//for

	    for (int i = 99; i >= 0; i--) {
	    	int n = 99;//행
	    	int m = i;//열
	    	if (arr[n][i]==0) {
	    		continue;
	    	}
	    	while(n > 0) {
			    if (arr[n][m-1]==1) {
			    	m--;
			    	}else if(arr[n-1][m]==1){
			    		n--;
			    		}else{
			    			break;
			    			}
	    }//while
	    	System.err.println(i);
	    	}//for
	}//main
}//class
