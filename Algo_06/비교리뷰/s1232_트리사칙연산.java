package 비교리뷰;

//사칙연산
public class s1232_트리사칙연산 {
	static class Node{
		int value; //노드값
		char opr; //연산자
		int left, right; //자식노드번호
		
		public Node(int value, char opr, int left, int right) {
			super();
			this.value = value;
			this.opr = opr;
			this.left = left;
			this.right = right;
		}

		public Node(int value) {
			this.value = value;
		}
		
	}
	static int N ;//노드 갯수
	static int result;//계산 결과
	static Node[] nodes;
	
	public static void main(String[] args) {
		N = 5;
		nodes = new Node[N+1];
		nodes[1] = new Node(0, '-', 2, 3);
	    nodes[2] = new Node(0, '-', 4, 5);
	    nodes[3] = new Node(10);
	    nodes[4] = new Node(88);
	    nodes[5] = new Node(65);
	    
	    int answer = calc(nodes[1]);
	    System.out.println(answer);
	}
	
	private static int calc(Node node) {
		char opr = node.opr;
		if(opr == '-') {
			return nodes[node.left].value - nodes[node.right].value;
		}else if(opr == '+') {
			return nodes[node.left].value + nodes[node.right].value;
		}else if (opr == '*'){
			return nodes[node.left].value*nodes[node.right].value;
		}else {
			return nodes[node.left].value/nodes[node.right].value;
		}
	}

	
}//end class
