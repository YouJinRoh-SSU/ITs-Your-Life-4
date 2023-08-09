package day_02;

public class ArrayExam2 {

	public static void main(String[] args) {
		int i = 5; 
		//스택에 만들어짐
		
		int[] arr = new int[] {10,20,30}; 
		//new하면 힙에 만들어짐, 참조타입, 기본타입 외에는 new로 만들어야함, 배열상수(배열 literal)=>초기화용.변수 선언시에만 사용 가능  
		//이미 만들어진 곳에 arr={5,7} 선언은 불가능, new 로 해야함 
		
		int[][] ar = { {2,3},{4,5},{8,9} };
		//2차원 => 1차원 배열의 항목들이 또 다른 1차원 배열을 가르키는
		
		int[][] arr2= {
				{80,90,96}, //arr2[0]의 1차원 배열 
				{76,88}  //arr2[1]의 1차원 배열 
		};
		System.out.println(arr2);
		System.out.println(arr2[0]); //80,90,96이 있는 시작 위치 
		System.out.println(arr2[1]); //76,88이 있는 시작 위치 
		System.out.println(arr2[0][0]); 
		//arr2[0]과 arr2[0][0] 은 변수명임 
		//new 없이 만들면 메서드에 저장, 다시는 안지워짐?
		
		int[][] arr3 = new int[][] {
			new int[] {80,90,96},
			new int[] {76,88}
		};
		
		int[][] arr4 = new int[2][]; //처음 부분만 확정, 뒷 부분은 나중에 
		arr4[0] = new int[3];
		arr4[1] = new int[2];
		arr4[0][0] = 80;
		arr4[0][1] = 90;
		arr4[0][2] = 96;
		
		arr4[1][0] = 76;
		arr4[1][1] = 88;
			
	}
//자바는 255차원까지 지원 
}
