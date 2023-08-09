package day_02;

public class Arrayexam {

	public static void main(String[] args) {

		int[] arr; //선언
		arr=new int[3]; //대입 
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		System.out.println(arr); // [ : 배열이라는 뜻, I : integer, @ : 구분자, 그 뒤 : 참조값
		
		int[] arr2= {100,200,300}; //선언과 대입을 한번에, 변수 선언할 때 배열 대입, 선언이랑 따로 할당하면 오류남, 따로하려면 초기화하는 코드로 사용 
//		int[] arr2;
//		arr2 = {100,200,300}; 오류남. 변수 초기화 시에만 사용할 수 있는 구문
//메모리 자동 관리는 Heap만 적용 
		System.out.println(arr2[2]);
		
		int[] arr3 = new int[] {100, 200, 300}; //선언과 대입을 한번에, 추천 형태. 힙 공간에 배열을 만드는 것. 메모리 값을 바꿀 때도 사용 가능
		arr3 =  new int[]{200, 300, 400}; //위에서 만들어진 것은 버려지고 여기서 선언한게 저장됨 
		System.out.println(arr3[2]);
		
		String s ="kim"; //literal 형식: 타입을 값으로 표현한 것(메서드 영역에 만들어짐) , new String("kim) 으로도 생성 가능 
		int i = 50; // i는 스택에 저장됨. s와 i가 저장된 메모리가 다름, int 타입의 literal  
		
		System.out.println(arr3.length);
		
	}
// new는 무조건 힙 공간에 만들어짐 
//가비지는 CPU가 놀고 있을 때 처리됨 
//기본 타입과 참조 타입의 저장 형식 차이... 게시판 만들 때 도움되는 건 아님 
}
