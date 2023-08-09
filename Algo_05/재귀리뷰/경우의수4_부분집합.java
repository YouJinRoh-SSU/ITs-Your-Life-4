package 재귀리뷰;

//조합?
public class 경우의수4_부분집합 {
	static int[] arr ; //원소
    static boolean[] visited;//사용여부
    static int n ; //답의 길이
    static int[] result; //답저장배열
    
    public static void main(String[] args) {
        arr = new int[]{1, 2, 3};
        n = 3;
        visited = new boolean[n];
        powerSet(0);//멱집합 
//        bit();
    }

    static void powerSet(int depth) {
        if (depth == n) {
            printResult();
            return;
        }

        visited[depth] = false;
        powerSet(depth + 1);

        visited[depth] = true;
        powerSet(depth + 1);
    }

    static void bit() {
        for (int i = 0; i < 1 << n; i++) {//i<8(1000)인지 
            for (int j = 0; j < n; j++) {
                if ((i & 1 << j) != 0)//해당 자리가 추출할 수 있는 자리인지 물어봄 
                    System.out.print(arr[j] + " ");//j가 0,1,2,3 에 따라 i가 0001,0010,0100,1000인지를 물어봄?
            }
            System.out.println();
        }
    }

    static void printResult() {
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
