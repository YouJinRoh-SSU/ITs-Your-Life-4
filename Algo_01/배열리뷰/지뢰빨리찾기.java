package 배열리뷰;

import java.util.ArrayList;
import java.util.Scanner;

public class 지뢰빨리찾기 {
	public static void main(String[] args) {
		/*10X10 좌표에 10개 임의의 위치에 지뢰를 매설
		 * 사용자는 행, 열 좌표를 입력, 
		 * 해당 좌표가 지뢰이면 X표. 아니면 주위 8칸 내 지뢰 갯수 표시 
		 * 열지않은 좌표는 "+" 표시
		 * 작성순서(초기화)
		 * 1. 12X12 정수배열 생성
		 * 2. 중복되지 않는 10개의 좌표 생성
		 * 3. 각좌표에 9 저장. 주위에 1씩 증가
		 * 4. (반복)
		 * 5. 사용자로부터 좌표입력(행, 열)
		 * 6. 해당좌표의 값이 9 이상이면 "지뢰찾음" 출력
		 * 7. 해당좌표가 9미만이면 "지뢰아님" 출력 
		 * 8. 전자배열 출력(+ 오픈한 좌표, 숫자 지뢰아닌곳, X 지뢰)
		 * 9. 지뢰10개를 다 찾으면 종료. 아니면 5번부터 반복
		 */
		int[][] field = new int[12][12];//지뢰가 끝쪽에 있을 때 에러를 방지하기 위해 주위에 범퍼를 만들어줌 
		boolean[][] open = new boolean[12][12]; //좌표 오픈 여부
		//남은 지뢰 갯수
		int remainMines = 10;
		//중복되지 않은 10개의 좌표 생성 
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
            nums.add(i+1);
        }//1~100까지의 숫자를 저장하는 리스트
		
		for (int j = 0; j < 10; j++) {
			int r = (int)(Math.random()*nums.size());
			int num_r = nums.remove(r);//임의의 숫자를 하나씩 삭제하여 좌표로 지정 
			int row = num_r / 10+1;//테두리 부분이 나오면 안되기 때문 
			int col = num_r % 10+1;
			//지뢰지정하기
			field[row][col] = 9;
			//지뢰 주변 8개 방향 1증가
			field[row-1][col]++;
			field[row-1][col+1]++;
			field[row][col+1]++;
			field[row+1][col+1]++;
			field[row+1][col]++;
			field[row+1][col-1]++;
			field[row][col-1]++;
			field[row+1][col-1]++;
			
		}//1~100까지의 숫자 중 중복되지않는 10개의 좌표 생성 
		
		//사용자 좌표 입력 
		Scanner sc =new Scanner(System.in);
		while(remainMines != 0) {
			int n = sc.nextInt(); 
		    int m = sc.nextInt();
		    open[n][m] = true;
		     if (field[n][m]>=9) {
		    	System.err.println("지뢰 찾음");
			  
			    remainMines--;
			    }else {
			    	System.err.println("지뢰 아님");
		}	
	}
		
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (open[i][j]==true && field[i][j]<9){
					System.err.print("+"+" ");
					}else if(open[i][j]==true && field[i][j]>=9){
						System.err.print("X"+" ");
						}else if (open[i][j]==false && field[i][j]<9) {
							System.err.print(field[i][j]+" ");
							}else{
								System.err.print("X"+" ");
				}
			}
			System.err.println();
		}
		
	}
}
