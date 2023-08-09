package day_02;

public class ArrayEaxm3 {

	public static void main(String[] args) {
		int[] oldArr = {10,20,30};
		int[] newArr = new int[5];
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		//(old, old에서 몇번째부터 복사해서, new, new의 몇번째부터에 넣을건지, 넣을 개수)
		for (int i : newArr) { // newArr에 있는 항목들을 순서대로 한번씩 추출해서 저장 => index를 사용할 필요 없음
			System.out.println(i); // 인덱스 없이 바로 항목들로 
			
		}

	}

}
