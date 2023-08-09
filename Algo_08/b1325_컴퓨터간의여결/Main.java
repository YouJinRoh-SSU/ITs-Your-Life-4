package b1325_컴퓨터간의여결;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer>[] list;
    public static boolean[] visitied;//방문했는지 안했는지 확인 
    public static int[] distance;

    public static void BFS(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visitied[start] = true;

        while (!queue.isEmpty()){
            int cur = queue.poll();//poll : 반환하고 삭제하는 코드 
            for(int item : list[cur]){
                if(!visitied[item]){
                    visitied[item] = true;
                    queue.add(item);
                    //신뢰하는 컴퓨터를 신뢰하는 컴퓨터를 큐에 넣음=> 연결된 신뢰관계 다 꺼내기 
                    distance[item] ++;
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//요소 개수
        int k = sc.nextInt();//신뢰 관계 개수 

        list = new ArrayList[n+1];//신뢰도 저장 
        distance = new int[n+1];//신뢰도를 담고 있는 배열 

        for (int i = 0; i < n+1; i++) {
            list[i] = new ArrayList<>();//리스트의 요소 안에 리스트 만들기
            //여러개의 컴퓨터가 하나의 컴퓨터 신뢰 관계를 저장하기 위해 
            //인덱스 컴퓨터를 신뢰하는 컴퓨터들이 저장되어있음 
        }

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();//a는 b를 신뢰함 
            int b = sc.nextInt();
            list[a].add(b);
        }

        for (int i = 1; i <= n ; i++) {
            visitied = new boolean[n+1];
            BFS(i);
        }

        int max = Arrays.stream(distance).max().getAsInt();//가장 신뢰도가 큰 값 찾기 
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if(distance[i] == max){//가장 신뢰를 많이 하는 컴퓨터 
                answer.add(i);
            }
        }

        Collections.sort(answer);//정렬
        for(int item : answer){
            System.out.print(item + " ");
        }
        System.out.println();

    }
}
