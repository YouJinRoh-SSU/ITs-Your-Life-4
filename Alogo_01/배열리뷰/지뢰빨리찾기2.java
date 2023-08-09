package 배열리뷰;
import java.util.ArrayList;

public class 지뢰빨리찾기2 {
	public static void main(String[] args) {
		int [][] dir = {{-1, -1}, {-1, 0}, {-1, 1},
                  {0, 1}, {1, 1}, {1, 0}, {1,-1}, {0, -1}};
       
        int[][] map = new int[12][12];
        ArrayList<Integer> dup = new ArrayList<Integer>();
       
        for(int i = 0;i < 100;i++) {
           dup.add(i+1);
       }
       
        for(int i = 0;i < 10;i++) {
           int rand = (int)(Math.random() * dup.size());
           int num_r = dup.remove(rand);
           int row = num_r / 10 +1;
           int col = num_r % 10 +1;
           
           map[row][col] = 9;
           
           for(int j = 0;j < 8;j++) {
               int nr = row + dir[j][0];
               int nc = col + dir[j][1];
               map[nr][nc]++;
           }
           
       }
       //출력
       for(int i = 0;i < 12;i++) {
           for(int j = 0;j < 12;j++) {
               System.out.print(map[i][j] + " ");
           }
           System.out.println();
       }
	}
}

