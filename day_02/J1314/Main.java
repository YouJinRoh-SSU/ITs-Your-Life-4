package J1314;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[][] arr = new int[n][n];
		int m = 0;
		int ch= 65;
		
		while(m < n) {
			if ((char)ch=='Z') {
				ch=65;
			}
			
			if(m%2 == 1) {
				for(int i=0;i<n;i++) {
					arr[i][m]=(char)ch;
					ch=(char)(ch+1);
				}
				
			}else {
				for(int i=n-1;i>=0;i--) {
					arr[i][m]=(char)ch;
					ch=(char)(ch+1);
				}
				
			}
			m++;
		}//end while 

		//출력 
		for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
	}
            }      
		}
}
