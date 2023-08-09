package b9742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 순열 {
	private static int totalCount, num;//몇 번째 순열을 출력할 것인지 
    private static boolean visit[]; // 중복 방지 위해 방문했는지 체크하는 배열
    private static char[] chars; // 값을 담을 배열
    private static String answer;//답 출력 


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line=br.readLine())!=null){
            StringTokenizer st = new StringTokenizer(line);
            String str = st.nextToken();
            num = Integer.parseInt(st.nextToken());//몇 번쨰 순열을 출력할건지

            totalCount=0;//총 몇 개의 순열이 나오는 지 세기 위해
            chars=new char[str.length()];//문자 집합 배열 만들기 
            visit=new boolean[str.length()];

            dfs(str, 0);//str 은 문자열

            if(totalCount<num) answer="No permutation";
            System.out.println(str+" "+num+" = "+answer);
        }
    }

    private static void dfs(String str, int cnt){
        if(cnt==str.length()){
            totalCount++;//몇 번째인지 체크
            if(totalCount==num) 
            	answer=new String(chars);
            return;
        }

        for(int i=0; i<str.length() && totalCount != num; i++){
            if(!visit[i]){
                visit[i]=true;
                chars[cnt]=str.charAt(i);//result[depth] = arr[i]
                dfs(str, cnt+1);
                visit[i]=false;
            }
        }
    }
    
}
