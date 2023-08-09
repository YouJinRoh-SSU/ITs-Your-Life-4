package b2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> myQ = new LinkedList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			myQ.add(i);
		}//큐에 카드 저장하기
		while(myQ.size() > 1) {
			myQ.poll();//맨 앞의 카드 버리기
			myQ.add(myQ.poll());
		}
		System.err.println(myQ.poll());
		
		
		
	}//main

}//class
