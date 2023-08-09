package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class b25192 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        HashSet<String> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
        	String nm = sc.next();
        	
			if (nm.equals("ENTER")) {
				ans = ans + set.size();
				set.clear();
				continue;
			}
			set.add(nm);	
        }
        System.out.println(ans+set.size());
	}

}
