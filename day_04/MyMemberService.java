package day_04;

public class MyMemberService {
	private MyMember[] mems = new MyMember[300];
	private int count = 0;
	//저장용 클래스에서만 getter,setter 만듬
	
	public void add(MyMember mm) {
		mems[count] = mm;
		count++;
	}
	
	public int getCount() {
		return count;
	}

	public void printAll() {
		System.out.println("**전체 출력**");
		System.out.println("저장 갯수= "+count);
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		}
	}

	public searchByName(String findMem) {
		for (int i = 0; i < count; i++) {
			if (findMem == mems[i].getName()) {
				return mems[i];
			}
			
		}//end for  
		return null; //검색 실패
	}

	public boolean update(String string, int i) {
		MyMember m = searchByName(name);
		if(m == null)
			return false; //작업실패
		int age = m.getAge();
		m.setAge(age+1);
		return true; //작업성공
	}
	
}
//여기서만 만들고 외부에서는 간접 접근 