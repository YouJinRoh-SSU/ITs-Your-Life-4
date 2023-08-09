package day_0724;
/**자바 그림판 메인 테스트 클래스*/

public class PainterExam {
	public static void main(String[] args) {
		//도형객체 생성(선, 원, 사각, 다각형)
		//선 : x1, y1, x2, y2
		//원 : x,y,radius
		//사각 : x,y,width,height
		//MyShape : 도형의 부모클래스, 도형들의 공통변수, 메서드를 정의
		MyLine l = new MyLine(3,3,5,5);//선 객체
		System.out.println(l.draw());
		System.out.println(l);
		MyCircle c = new MyCircle(4,5,2);
		System.out.println(c.draw());
		System.out.println(c);
		//
		MyLine[] lines = new MyLine[100];//100개는 최대치
		int lineCount = 0;
		//저장
		lines[lineCount++] = new MyLine(0,0,1,1);
		lines[lineCount++] = new MyLine(3,3,9,9);
		lines[lineCount++] = new MyLine(6,6,19,19);
		lines[lineCount++] = new MyLine(9,9,29,29);
		//갯수
		System.out.println("Line 갯수"+lineCount);
		//검색. 시작 좌표로 검색
		int findx = 3, findy = 3;//찾으려는 대상좌표
		int findIndex = -1;//찾으려는 대상의 위치
		for (int i = 0; i < lineCount; i++) {
			MyLine myLine = lines[i];
			if(myLine.getX()==findx & myLine.getY()==findy) {
				findIndex = i;
				break;
			}
		}//end for 
		System.out.println((findIndex == 1) ? "못찾음":"찾음");
	}//main
}//class
