import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sw1232 {
	

	static class Node {//노드 클래스
		float data;
		int lchild;//left자식
		int rchild;//right자식
		char op;//연산자 
	}//노드 클래스

		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			for (int TC = 1; TC <= 10; TC++) {//Test Case
				int T = Integer.parseInt(br.readLine());//정점의 개수 

				Node[] Tree = new Node[T + 1];//Node타입의 배열 선언

				for (int i = 0; i <= T; i++)
					Tree[i] = new Node();//정점의 개수만큼 각 Node 생성

				for (int i = 0; i < T; i++) {
					StringTokenizer sz = new StringTokenizer(br.readLine());

					int idx = Integer.parseInt(sz.nextToken());//인덱스 번호 읽기 
					String s = sz.nextToken();//인덱스 다음 문자?

					if (!Character.isDigit(s.charAt(0))) {//만약 연산자가 들어오면
						//isDigit : 이 문자가 숫자인지 문자인지 속성 확인해줌 , 숫자면 true
						//charAt : 문자열에서 특정위치의 문자를 불러옴
						Tree[idx].op = s.charAt(0);//연산자를 넣고
						Tree[idx].lchild = Integer.parseInt(sz.nextToken());
						Tree[idx].rchild = Integer.parseInt(sz.nextToken());
						//왼쪽, 오른쪽 자식도 넣음
					}//if

					else
						Tree[idx].data = Float.parseFloat(s);//연산자가 아닌 숫자가 들어오면 data에 저장
				}//for

				System.out.println("#" + TC + " " + (int) solve(Tree, 1)); //계산 
			}//for
			br.close();
		}//main

		public static float result;

		public static float solve(Node[] Tree, int node) {
			if (Tree[node].op != '0' && Tree[node].op == '+')
				result = solve(Tree, Tree[node].lchild) + solve(Tree, Tree[node].rchild);

			else if (Tree[node].op != '0' && Tree[node].op == '-')
				result = solve(Tree, Tree[node].lchild) - solve(Tree, Tree[node].rchild);

			else if (Tree[node].op != '0' && Tree[node].op == '*')
				result = solve(Tree, Tree[node].lchild) * solve(Tree, Tree[node].rchild);

			else if (Tree[node].op != '0' && Tree[node].op == '/')
				result = solve(Tree, Tree[node].lchild) / solve(Tree, Tree[node].rchild);	
			//현재 노드가 연산자이면 (왼쪽 자식 연산자 오른쪽 자식)의 형태로 재귀

			else//연산자가 아니면 result에 넣고
				result = Tree[node].data;

			return result;//return
		}//solve
		
	}//class


