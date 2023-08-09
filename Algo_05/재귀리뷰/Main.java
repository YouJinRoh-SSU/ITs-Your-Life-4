package 재귀리뷰;

//작은 수를 앞으로 보내기 
public class Main {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n-1; i++) {
			for (int j = n-1; j < i; j--) {
				if(a[j]>a[j-1]) {
					swap(a, j, j-1);
				}
			}
		}
	}

}
