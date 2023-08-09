package 알고리즘과목평가1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바둑공원 {
	static int[][] arr;
	static int cnt;
	static int ans;
	static int pp;
	static int cc;
	static int dd;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			   	
		int[][] arr = new int[19][19];
		for (int i = 0; i < 19; i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int j = 0; j < 19; j++) {
				arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}//바둑 배열 입력
		
		//세로로 누가 이겼는지 확인 
		for (int i = 0; i < 19; i++) {//열별로 확인
			cnt = 0;//5개가 연속으로 있는지 확인하는 변수 
			for (int j = 1; j < 19; j++) {
				if (arr[j][i]!=0 && arr[j][i]==arr[j-1][i]) { 
					cnt++;//0이 아니면서 앞과 같은 숫자일 경우가 연속 4번이면 5개의 숫자가 연속으로 나타나는 것
				}else {
					cnt = 0;
				}
				if (cnt == 4) {
					pp++;//누군가 이긴적이 있는지 확인하는 변수
					System.out.println(arr[j][i]);//누가 이겼는지 출력 
					System.out.print((j-4+1)+" ");//가장 왼쪽의 위치 출력
					System.out.print(i+1);//가장 왼쪽의 위치 출력
				}
			}		
		}
		//가로로 누가 이겼는지 확인
		for (int i = 0; i < 19; i++) {//행별로 확인 
			cnt = 0;
			for (int j = 1; j < 19; j++) {
				if (arr[i][j]!=0 && arr[i][j]==arr[i][j-1]) { 
					cnt++;//0이 아니면서 앞과 같은 숫자일 경우가 연속 4번이면 5개의 숫자가 연속으로 나타나는 것
					}else {
						cnt = 0;
				}
				if (cnt == 4) {
					pp++;//누군가 이긴적이 있는지 확인하는 변수
					System.out.println(arr[i][j]);//누가 이겼는지 출력 
					System.out.print((i+1)+" ");//가장 왼쪽의 위치 출력
					System.out.print(j-4+1);//가장 왼쪽의 위치 출력
				}
			}
		}
		//대각선으로 누가 이겼는지 확인
		//
		
		
		//무승부일 경우 
		if (pp==0) {//무승부일 경우 0 출력
			System.out.println(0);
		}
	}//main
}//class
