package b11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//2차원의 구간 합 구하는 방법

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int si = Integer.parseInt(stringTokenizer.nextToken());//2차원 배열의 크기
		int qu = Integer.parseInt(stringTokenizer.nextToken());//구간 합 질의의 개수
		int[][] arr = new int[si+1][si+1];//테두리 만들기?
		for (int i = 1; i < si; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for (int j = 1; j <= si; j++) {
				arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}//배열 만들기
		int[][] dd = new int[si+1][si+1];
		for (int i = 1; i < si; i++) {
			for (int j = 1; j < si; j++) {
				dd[i][j] = dd[i][j-1] + dd[i-1][j] - dd[i-1][j-1] + arr[i][j];
			}
		}//구간 합 배열 만들기
		
		for (int i = 0; i < qu; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int x1 = Integer.parseInt(stringTokenizer.nextToken());
			int y1 = Integer.parseInt(stringTokenizer.nextToken());
			int x2 = Integer.parseInt(stringTokenizer.nextToken());
			int y2 = Integer.parseInt(stringTokenizer.nextToken());
			
			int ans = dd[x2][y2]-dd[x1-1][y2]-dd[x2][y1-1]+dd[x1-1][y1-1];
			System.err.println(ans);
		}
	}

}
