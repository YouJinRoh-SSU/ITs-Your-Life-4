package day_04;

public class MyMemberExam {
	public static void main(String[] args) {
		//회원정보 관리 - 등록, 검색(목록 기능, 찾아내는 기능), 수정, 삭제(CRUD)
		//회원 : 이름, 나이
		MyMember m1 = new MyMember("홍길동", 35);
		System.out.println(m1);//주소값을 호출하면 toString 메서드가 호출되도록 함. toString을 호출한 것과 같은 결과 
		System.out.println(m1.toString());
		
		//MyMember[] mems = {new MyMember(),new MyMember(),new MyMember()};  
		MyMember[] mems = new MyMember[300];
		//MyMember의 객체(MyMember의 주소를 저장할 곳)가 만들어진 것, 저장할 방만 3개를 만든것. 
		//mems =>배열, m1=> 객체 둘이 다름
		
		int count = 0; //객체를 저장할 위치를 구하기 위해 => 저장된 갯수를 의미  
		mems[count++] = new MyMember("홍길동",35);
		mems[count++] = new MyMember("김길동",25);
		mems[count++] = new MyMember("박길동",30);
		System.out.println(count);
		
		//목록출력
		for (int i = 0; i < count; i++) { //길이를 mems.length로 하면 300개가 되므로 count로 해야 실제 저장한 만큼 나옴 
			System.out.println(mems[i]);
		}
		//회원검색
		String findName = "홍길동";
		System.out.println("**회원검색**");
		int targetIndex = -1; //찾은 회원의 위치 번호
		for (int i = 0; i < count; i++) {
			if (findName == mems[i].getName()) {
				System.out.println(i +" 찾았습니다. "+mems[i]);
				targetIndex = i; //찾았는지 확인이 가능함
			}
		}//for 
		if (targetIndex == -1) {
			System.out.println("못 찾았음");
			}else {
				System.out.println("찾았음");
		}
		
		//수정-김길동의 나이를 1증가 => 수정하려면 일단 검색
		System.out.println("**회원 수정**");
		String findName2 = "홍길동";
		
		System.out.println("**회원검색**");
		int targetIndex2 = -1; //찾은 회원의 위치 번호
		
		for (int i = 0; i < count; i++) {
			if (findName2 == mems[i].getName()) {
				System.out.println(i +" 찾았습니다. "+mems[i]);
				targetIndex2 = i; //찾았는지 확인이 가능함
			}
		}//for 
		if (targetIndex2 == -1) {
			System.out.println("못 찾았음");
			}else {
				System.out.println("찾았음"+mems[targetIndex2]);
				int age = mems[targetIndex2].getAge();
				mems[targetIndex2].setAge(age+1);
				System.out.println("수정후: "+ mems[targetIndex2]);
		}
		
		//삭제 - 가운데가 지워지면 뒤쪽을 하나씩 땡겨야함 =>객체 자체는 삭제하는 것이 불가능함. 자바는 할당된 메모리 삭제 기능이 없음.
		//null 값으로 지정시켜줌. 객체를 안가리키도록 
		System.out.println("**회원 삭제**");
		String findName3 = "김길동";
		//일단 찾기
		int targetIndex3 = -1; //찾은 회원의 위치 번호
		
		for (int i = 0; i < count; i++) {
			if (findName3 == mems[i].getName()) {
				System.out.println(i +" 찾았습니다. "+mems[i]);
				targetIndex3 = i; //찾았는지 확인이 가능함
			}
		}//for 
		if (targetIndex3 == -1) {
			System.out.println("못 찾았음");
			}else {
				count--;	
		} 
	}//main
}//class
