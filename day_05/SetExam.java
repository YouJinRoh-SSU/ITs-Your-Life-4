package day_05;

import java.util.HashSet;
import java.util.Set;


public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>(); //set 인터페이스 안에 있는 메서드 
		
		박태환선수 bt = new 박태환선수();
		수영선수 s1;
		s1 = bt;
		야구선수 b1;
		b1 = bt;
	}
}
interface 야구선수{
	public void 공던지기();
}

interface 수영선수{
	public void swimming();
	//이 기능을 가지고 있으면 수영선수다
}
class 박태환선수 implements 수영선수, 야구선수{
	public void swimming() {
		System.out.println("수영하기");
	}///반드시 있어야 수영선수임
	public void 공던지기() {	
		System.out.println("공 던지기");
	}
}
