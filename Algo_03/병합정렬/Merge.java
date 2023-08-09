package 병합정렬;

public class Merge {
	//분할한 다음 정렬해서 합치기
	static int[] buff;//잡업용 배열
	
	static void __mergeSort(int[] a, int left, int right) {
		if(left<right) {
			int i;
			int center = (left+right)/2;
			int p =0;
			int j =0;
			int k = left;
			
			__mergeSort(a, left, center);
			__mergeSort(a, center+1, right);
			
			for (i = left; i< center; i++) {
				buff[p++] = a[i];//작업용 배열에 a 배열 넣기
			}
			while (i<= right && j<p)
				a[k++] = (buff[j]<=a[i]) ? buff[j++]:a[i++]; //작업용배열이랑 a배열 중 큰값 넣기
			
			while(j<p)
				a[k++]=buff[j++]; //남는 거 다 넣기 
			
		}
	}

}
