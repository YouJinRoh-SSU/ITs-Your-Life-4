package 비교리뷰;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparableExam {
	static class Person implements Comparable<Person>{
		String name;
		int age;
	
	
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}


		public int compareTo(Person o) {
		//음수이면 this가 선순위, 양수이면 this가 후순위, 0이면 동일순위
		return this.age - o.age;
		}

		@Override
		public String toString() {
			return name;
		}
		
	}//end person
	static class NameComparator implements Comparator<Person>{
		public int compare(Person o1,Person o2 ) {
			//음수이면 o1가 선순위, 양수이면 o2가 후순위, 0이면 동일순위
			return o1.name.compareTo(o2.name);
			}		
	}//end
	
	public static void main(String[] args) {
		Person p1 = new Person("홍", 30);
		Person p2 = new Person("김", 35);
		System.out.println(p1.compareTo(p2));
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(p2);
		arr.add(p1);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		//이름기준 정렬 => Person 자체적으로 나이기준 정렬법을 정하기
		NameComparator nc = new NameComparator();
		Collections.sort(arr, nc);//Collections : list 정렬할 때 사용
		System.out.println(arr);
	}
}

//comparable(compareTo 함수)은 내부적인 요소로 정렬, comparator(compare 함수)은 외부 요소로 정렬가능