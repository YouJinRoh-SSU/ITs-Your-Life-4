package s1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 사다리타기2 {
	static int[] dx = { 0, 0, -1 };
    static int[] dy = { -1, 1, 0 };
    static int[][] arr;
    //사다리 아래서 위로
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int targetX = 0, targetY = 0;//시작점 

        for (int test_case = 1; test_case <= 10; test_case++) {
            int T = Integer.parseInt(br.readLine()); //test case 번호 
            arr = new int[101][101];
            for (int i = 0; i < 100; i++) {//행번호 Y좌표
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {//열번호 X좌표
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if (arr[i][j] == 2) {
                        targetX = i;
                        targetY = j;//시작점 표시 
                    }
                }
            }
            int result = sadari(targetX, targetY);
            System.out.println("#" + T + " " + result);
        }
    }

    public static int sadari(int x, int y) {
        int ans = 0;
        while (true) {
            if (x == 0) {
                ans = y;
                break;
            }
            for (int i = 0; i < 3; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (inRange(nx, ny) && arr[nx][ny] == 1) {
                    //지나온 길 표시
                    arr[x][y] = 4;
                    x = nx;
                    y = ny;

                }
            }
        }

        return ans;
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && y >= 0 && x < 100 && y < 100;
    }
}
