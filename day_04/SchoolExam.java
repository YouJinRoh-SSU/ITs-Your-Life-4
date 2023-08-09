package day_04;

public class SchoolExam {
	public static void main(String[] args) {
		//학교 내 인원 관리
		//관리대상 - 학생, 교수, 직원
		//학생 - 학번, 이름, 학과
		//교수 - 교번, 이름, 연구실호수
		//직원 - 사번, 이름, 부서
		//class Person {id, name}
		//class Student extends Person {hakgwu}
		//class Teacher extends Person {yeongu}
		//class Emp extends Person {buseo}
		
		Person p = new Person("100","홍길동");
		System.out.println(p);
		
		Student st = new Student("200","김길동","컴공");
		System.out.println(st.toString());
		Emp e = new Emp("300","박길동","개발");
		System.out.println(e.toString());
		
		p = st;
		p = e;
		System.out.println(p); //e(자식)가 출력됨=>자식의 재정의 메서드 실행 
		//
		Person[] pa = new Person[100];
		pa[0] = st;
		pa[1] = e;
		//학교인원관리기능ㅁ
		SchoolService ss = new SchoolService();
		ss.add(st);
		ss.add(e);
		//
		System.out.println(st instanceof Student ); //true, false 결과 
		System.out.println(st instanceof Person); //true, false 결과 
		if (p instanceof Student) {
			Student st2 = (Student)p; //다운캐스팅 시도 
			System.out.println("학생");
		}else {
			System.out.println("학생 아님");
		}
	//다운 캐스팅은 instanceof를 해서 체크를 확인한 후 넘어가야함 
	}
}
