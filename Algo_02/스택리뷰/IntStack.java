package 스택리뷰;

import 스택리뷰.IntStack.EmptyIntStackException;
import 스택리뷰.IntStack.OverflowIntStackException;

public class IntStack {
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}

	}

	public class EmptyIntStackException extends RuntimeException {//그냥 Exception은 필수처리예외
		public EmptyIntStackException () {}
	}

	private int[] stk;
	private int capacity;//최대 저장 개수
	private int ptr = 0;//현재 저장할 위치(현재 저장 갯수)

	public IntStack(int len) {
		stk = new int[len];
		capacity = len;
	}

	public IntStack() {
		this(64); 
		//객체 초기화 목적의 기능 - 생성자 내에서 호출 가능 
		//내부 변수에 대한 접근을 일원화
		//생성자 메서드에서 다른 생성자 메서드 호출
	}

	public int push(int i) throws OverflowIntStackException{
		if(ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = i;
	}

	public int pop() throws EmptyIntStackException{
		if(ptr == 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

}
