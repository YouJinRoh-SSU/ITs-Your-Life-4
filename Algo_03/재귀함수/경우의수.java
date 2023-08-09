package 재귀함수;

import java.util.Iterator;
import java.util.Scanner;

public class 경우의수 {
	static int[] arr;
	static int[] result;
	static int n;
	
	public static void main(String[] args) {
		//주어진 원소를 이용한 생성가능한 모든 경우의 수
		//{1, 2, 3} => 123, 132, 213, 111, 112
		//{1,2} 중복사용가능 경우의 수 : 11, 12, 21, 22
		//{1,2} 중복사용불허 경우의 수 : 12, 21
		//3개의 숫자 중 
		arr = new int[] {1,2,3};//원소 저장 배열 //선언 이후에 배열에 값을 할당할 때는 new 를 붙여야함 
		result = new int[arr.length];//답 저장 배열 
		n = 3;// 추출의 갯수
		recur(0);	
	}
	private static void recur(int depth) {
		if (depth == n) {//종료조건
			print();
			return;
		}
		//처리코드(깊이의 숫자 위치에 i값을 저장)
		for (int i = 0; i < arr.length; i++) {
			result[depth] = arr[i];
			recur(depth+1);
		}
	}
	private static void print() {
		for (int i : result) {
			System.out.println(i);
		}
		System.out.println();
	}

}
