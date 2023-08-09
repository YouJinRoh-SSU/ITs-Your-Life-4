package J9074;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine(); 
		
		StringTokenizer st = new  StringTokenizer(line);

		int[] count = new int[11];

		while(st.hasMoreTokens()) {
			String s = st.nextToken();

			int i = Integer.parseInt(s);
			
			if(i>=1 && i <=20) {
				count[i]++;
			}else break;
			
		} 
		for(int i =0 ; i<=10; i++) {
			if(count[i]==0) {
				continue;
			}else {
				System.out.println(i + " : " + count[i] + "개");
			}
			
		}
	}
}
