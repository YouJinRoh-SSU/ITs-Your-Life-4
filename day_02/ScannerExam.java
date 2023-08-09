package day_02;

import java.util.Scanner;
//먼저 소속을 입력해야함
//안쓰면 java.util.Scanner ~ 로 써줘야함

public class ScannerExam {

	public static void main(String[] args) {
		System.out.println("이름을 입력하세요>> ");
		Scanner sc = new Scanner(System.in); //딱 하나만 만들어야함. 키보드 한 개의 장치에서 읽어들일 수 있어서
		//다른 패키지에서 쓰려면 먼저 선언을 해줘야함 => import 로 불러옴
		//내부적으로 원하는 형태로 변환해주는 기능
		String name = sc.next(); //다음 동작을 할 때까지 무한히 대기 Blocking Method =>파이썬에서 input같은건가??
		System.out.println("이름은 " + name );
		
		System.out.println("태어난 해를 4자리로 입력하세요");
		int year = sc.nextInt();
		System.out.println("나이는 " + (2023-year+1));
		
//sc.nextBigDecimal();	
//next : 공백문자를 기준으로 분리, 입력
//sc.next() 글자 한개 단어씩 추출 - String
//sc.nextInt() 숫자 한개씩 추출 - Int
//sc.nextLine() 한줄씩 추출 - String
//BigDecimal : DB랑 연결할 때 사용 , 엄청 크게 사용할 수 있게?

	}

}
