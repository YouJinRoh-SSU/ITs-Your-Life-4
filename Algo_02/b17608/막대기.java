package b17608;

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 막대기 {
	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     StringTokenizer st;
	     
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<>();
		for (int i = 0; i < N; i++) {
			stk.push(Integer.parseInt(br.readLine()));
       }//for
		int cnt = 1;
		int now = 0;
	    int fr = stk.pop();
	    while(!stk.isEmpty()) {
	    	now = stk.pop();
	    	if (now>=fr) {
	    		fr = now;
	    		cnt++;	
		}//if
		
	}//while
	    System.err.println(cnt);
	
}//main
}//class

  
