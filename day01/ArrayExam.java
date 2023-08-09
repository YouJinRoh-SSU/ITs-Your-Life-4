package day01;

public class ArrayExam {

	public static void main(String[] args) {
		int[] arr; //선언
		arr= new int[3]; //대입 오른쪽이 먼저 실행됨(new int[3])-배열은 0으로 자동 초기화가 됨 - boolean이나 다른 타입은 다르게 초기화됨  
		System.out.println(arr[0]); //arrr은 배열 변수
		System.out.println(arr[1]); //arrr은 배열 변수
		System.out.println(arr[2]); //arrr은 배열 변수
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        for (int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
	}

}

