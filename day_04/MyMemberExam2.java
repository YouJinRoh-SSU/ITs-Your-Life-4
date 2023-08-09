package day_04;

public class MyMemberExam2 {
	public static void main(String[] args) {
		MyMemberService ms = new MyMemberService();
		//회원등록
		MyMember mm = new MyMember("홍길동", 35);
		ms.add(mm);
		mm = new MyMember("김길동", 28);
		ms.add(mm);
		mm = new MyMember("박길동", 40);
		ms.add(mm);
		System.out.println("저장개수= "+ms.getCount());
		//목록출력
		ms.printAll();
		//검색 - 김길동의 참조값 반환 / 순서번호 반환 
		//검색의 성공/실패 => 성공 : 0(양수) 실패 : -1
		// true/false => 검색기능에 부적합
		// 참조값 : 참조값 / null 
		MyMember findMem = ms.searchByName("김길동2");
		if (findMem == null) {
			System.out.println("못 찾음");
		}else{
			System.out.println("찾았음"+findMem);
		}
		//수정- 김밀동의 나이 1 증가
		boolean b = ms.update("김길동", 1);
		if (b)
			System.out.println("성공");
		else 
			System.out.println("실패");
		
	}
}
