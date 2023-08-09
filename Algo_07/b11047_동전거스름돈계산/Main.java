package b11047_동전거스름돈계산;
import java.io.IOException;
import java.util.Scanner;


//동전 개수의 최솟값 구하기
public class Main{	
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        		
        arr = new int[N];
		int result = K;
		int cnt = 0;
		
		for (int i = N-1; i >= 0; i--) {
			arr[i] = sc.nextInt();
		}//입력 배열 => 큰 수 부터 배열
		
		for (int i = 0; i < N; i++) {
			if (result == 0)
				break;
			
			if (arr[i]<=result) {
				cnt = cnt + result/arr[i];
				result = result%arr[i];
			} else {
				continue;
			}
			
		}//for
		
		System.out.println(cnt);
	}

}
