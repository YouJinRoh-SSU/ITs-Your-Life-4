package day01;

public class SwitchExam {

	public static void main(String[] args) {
		
//가위바위보 컴퓨터 정하기(0, 1, 2)
		double d = Math.random(); // 0 <= r <1
		d*=3; // 0.0 ~ 2.999999 int 로 강제 형변환
		int i =(int)d;
//		if(i==0) {
//			System.out.println("가위");
//		}else if(i==1){
//			System.out.println("바위");
//		}else {
//			System.out.println("보");
//		}
//
//	
//		int lotto = (int)(Math.random()*44+1);
//		System.out.println(lotto);

		switch (i) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		default:
			break;
		}
		
	}	
}
