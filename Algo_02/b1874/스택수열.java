package b1874;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class 스택수열 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//숫자 갯수 입력
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i]=sc.nextInt()
;		}//수열 입력
		Stack<Integer> stk = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num = 1;
		boolean result = true;
		for (int i = 0; i < A.length; i++) {
			int su = A[i];
			if (su => num) {
				while (su >=num) {
					stk.push(num++);
				bf.append("+\n");
				}//while
				stk.pop();
				bf.append("-\n")
			}else {
				
			}
			
			
			
		}//for
	
		
	}//main
}//class
