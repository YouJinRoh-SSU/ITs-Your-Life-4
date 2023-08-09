package day_05;

import java.util.Comparator;

public class NameComparator implements Comparator<MyMember> {//이름 기준 정렬기 예시
	
	@Override	
	public int compare(MyMember o1, MyMember o2) {
		
		return o2.getName().compareTo(o1.getName());
		//return o1.getAge()-o2.getAge(); 나이 적은 애가 먼저
		//return o2.getAge()-o1.getAge(); 나이 많은 애가 먼저
		}
}
