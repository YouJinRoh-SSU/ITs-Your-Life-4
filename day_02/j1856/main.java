package j1856;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int m = kb.nextInt();
		int n = kb.nextInt();
		
		int count=1;
		int[][] arr = new int[m][n];
		
		
		for(int i=0;i<m;i++) {
			if (i%2==0) {
				for(int j=0;j<n;j++) {
					arr[i][j]=count;
					count+=1;
				}//for
			}else {
				for(int j=n-1;j>=0;j--) {
					arr[i][j]=count;
					count+=1;
			}//for
			}// else
		}//for
		
		//출력
		for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
		}
		
	}//main

}//class
