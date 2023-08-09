package b4195친구네트워크_유니온;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	 private static int T; //테스트케이스 수
	    private static int F; //친구 관계의 수
	    private static int[] parent; //유니온 집합셋
	    private static int[] count; //친구 관계 수

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        T = sc.nextInt();//테스트케이스
	        for (int t = 0; t < T; t++) {
	            F = sc.nextInt();//친구관계수
	            parent = new int[F * 2];
	            count = new int[F * 2];
	            for (int i = 0; i < F * 2; i++) {
	                parent[i] = i;
	            }
	            Arrays.fill(count, 1); //최초 친구 수는 기본값으로 한명이다
	            HashMap<String, Integer> map = new HashMap<>(); // 이름, 인덱스(노드번호)
	            int index = 0;
	            for (int f = 0; f < F; f++) {
	                String friend1 = sc.next();
	                String friend2 = sc.next();
	                if (!map.containsKey(friend1)) { //해당 친구이름이 아직 없는 경우 인덱스 부여
	                    map.put(friend1, index++);
	                }
	                if (!map.containsKey(friend2)) {
	                    map.put(friend2, index++);
	                }
	                System.out.print(union(map.get(friend1), map.get(friend2)));
	            }
	        }
	    }
	public static int union(int a, int b) {
		a = find(a);
        b = find(b);
        if (a != b) {
            if (a < b) {//친구가 더 많은쪽에 
                parent[b] = a; //집합 union
                count[a] += count[b]; //친구수 union
                return count[a];
            } else {
                parent[a] = b;
                count[b] += count[a];
                return count[b];
            }
        }
        return count[a];
    }
	public static int find(int a) {
		if(a == parent[a])
			return a;
		else
			return parent[a] = find(parent[a]);
	}
	
}