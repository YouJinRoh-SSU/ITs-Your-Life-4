package day_05;

public class StringExam3 {
	public static void main(String[] args) {
		//StringBuider  : 고속 문자열 처리 객체
		String s = "0123456789";
		String s2 = "";
		//실행시간 
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			s2 = s2 + s;
		}
		//새로운 메모리 사용 (String이 불변객체라)
		//쓰레기들이 많이 생김 => 시간이 많이 걸림
		
		System.out.println(s2);
		//실행시간
		long end = System.currentTimeMillis();
		
		System.out.println("실행시간 = "+(end-start));
		///
		StringBuffer ssb = new StringBuffer();
		//StringBuilder=>문자열 처리에서 많은 기능 제공
		StringBuilder sb = new StringBuilder();
		//실행시간 
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			sb.append(s);
		}
		System.out.println(sb.toString());
		//실행시간
		long end2 = System.currentTimeMillis();
		System.out.println("실행시간2 = "+(end2-start2));
		
	}//class
}//main
